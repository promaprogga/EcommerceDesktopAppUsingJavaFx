package com.company;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

public class Client implements Runnable{
    private  BufferedWriter writer;
    private BufferedReader reader;

    ArrayList <Client> clients;

    Client(Socket socket, ArrayList <Client> clients){

        try {
            OutputStreamWriter o= new OutputStreamWriter(socket.getOutputStream());
            writer = new BufferedWriter(o);

            InputStreamReader i=new InputStreamReader(socket.getInputStream());
            reader = new BufferedReader(i);

            this.clients=clients;

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void run() {
        try {

            String clientData= reader.readLine() +"\n";
            while(clientData!=null){
               for (Client client: clients){
                   synchronized (client.writer){
                       client.writer.write(clientData);
                       client.writer.flush();
                   }
               }
                clientData = reader.readLine() + "\n";
            }

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}

