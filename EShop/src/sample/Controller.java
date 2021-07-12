package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Controller extends Main{



    File myObj = new File("cart.txt");


    @FXML
    void EShopBtn(ActionEvent event) throws IOException {
        Parent root2 = FXMLLoader.load(getClass().getResource("Home.fxml"));
        Scene nextScene2 = new Scene(root2, 580, 450);
        window.setTitle("ESHOP");
        window.setScene(nextScene2);
        window.show();
    }

    @FXML
    void CartBtn(ActionEvent event) throws IOException {

        FXMLLoader loader=new FXMLLoader(getClass().getResource("Cart.fxml"));
        Parent root= (Parent)loader.load();
        Cart c= loader.getController();

        c.Cfunc(fileReadCart());
        c.Pfunc(fileReadPrice());

        window.setTitle("ESHOP");
        window.setScene(new Scene(root));
        window.show();


    }



    public void file(String n, String p, String q) {
        try {
            FileWriter myWriter = new FileWriter("cart.txt", true);
            BufferedWriter writer = new BufferedWriter(myWriter);
            writer.append(" " + n + "\t\t\t\t\t\t\t\t\t" + q + "\t\t\t\t\t\t\t" + p +" Tk");
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public int subtotal = 0;
    public int total;
    String s;

    public void file1(int q, int p) {
        total = q * p;
        subtotal += total;
        s= Integer.toString(subtotal);
        try {
            FileWriter myWriter = new FileWriter("price1.txt");
            BufferedWriter writer = new BufferedWriter(myWriter);
            writer.write(s);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void file2(int q, int p) {
        total = q * p;
        subtotal += total;
        s= Integer.toString(subtotal);
        try {
            FileWriter myWriter = new FileWriter("price2.txt");
            BufferedWriter writer = new BufferedWriter(myWriter);
            writer.write(s );
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String fileReadPrice() throws FileNotFoundException {
            String s;
            File myObj1 = new File("price1.txt");
            File myObj2 = new File("price2.txt");
            Scanner myReader1 = new Scanner(myObj1);
            Scanner myReader2 = new Scanner(myObj2);
            String data1 = myReader1.next();
            String data2 = myReader2.next();
            int d1 = Integer.parseInt(data1);
            int d2 = Integer.parseInt(data2);
            int sum = d1 + d2;
            s = Integer.toString(sum);

            myReader1.close();
            myReader2.close();
            return s;


    }


    public String fileReadCart() throws FileNotFoundException {
        ArrayList<String> result = new ArrayList<>();


        try (Scanner s = new Scanner(new FileReader(myObj))) {
            while (s.hasNext()) {
                result.add(s.nextLine()+"\n");
            }
            String list = Arrays.toString(result.toArray()).replace("[", " ").replace("]", "").replace(",", "");
            return list;
        }
    }
}
