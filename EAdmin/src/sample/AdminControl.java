package sample;
import java.io.*;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;


public class AdminControl {
    @FXML
    private TextArea Textarea;
    @FXML
    private TextArea Order;

    private BufferedWriter w;
    private BufferedReader r;
    public AdminControl (){
        try {
            Socket socket = new Socket("127.0.0.1", 3211);

            OutputStreamWriter o= new OutputStreamWriter(socket.getOutputStream());
            w= new BufferedWriter(o);

            InputStreamReader i=new InputStreamReader(socket.getInputStream());
            r= new BufferedReader(i);

            BufferedWriter bw = new BufferedWriter(new FileWriter(new File("input.txt"), true));

            Thread t = new Thread(){
                public void run(){
                    try{
                        String line = r.readLine() + "\n";
                        Textarea.appendText("A new Order from:\n");
                        bw.write("--------------------------------------------------------------------------------------------------------\n");
                        bw.write("Order from: \n");
                        while (line != null){
                            Textarea.appendText(line);
                            bw.write(line);
                            bw.flush();
                            line = r.readLine() + "\n";
                        }

                    }
                    catch (IOException e){
                        e.printStackTrace();
                    }
                }
            };
            t.start();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    void previousOrder(ActionEvent event) throws IOException {

        try {
            ArrayList<String> data = new ArrayList<>();
            File file = new File("input.txt");

            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()) {
                data.add(sc.nextLine()+"\n");
            }
            String list = Arrays.toString(data.toArray()).replace("[", " ").replace("]", "").replace(",", "");
            Order.setText(list);
            sc.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

}
