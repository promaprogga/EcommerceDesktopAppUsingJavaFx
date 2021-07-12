package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Cart extends Controller implements Initializable {


    @FXML
    public TextArea textA1,textA2;
    String data;


    @FXML
    void Clear(ActionEvent event) throws IOException {
        new FileWriter(new File("cart.txt"),false);
        PrintWriter writer = new PrintWriter(new File("price.txt"));
        PrintWriter writer1 = new PrintWriter(new File("price1.txt"));
        PrintWriter writer2 = new PrintWriter(new File("price2.txt"));
        writer.print("0");
        writer1.print("0");
        writer2.print("0");
        writer.close();
        writer1.close();
        writer2.close();
        textA1.clear();
        textA2.clear();
    }

    @FXML
    void EShopBtn(ActionEvent event) throws IOException {
        Parent root2 = FXMLLoader.load(getClass().getResource("Home.fxml"));
        Scene nextScene2= new Scene(root2, 600, 450);
        window.setTitle("ESHOP");
        window.setScene(nextScene2);
        window.show();
    }



    @FXML
    void checkOut(ActionEvent event) throws IOException {
        Parent rootCheck= FXMLLoader.load(getClass().getResource("CheckOut.fxml"));
        Scene nextScene4 = new Scene(rootCheck, 400, 309);
        window.setTitle("ESHOP");
        window.setScene(nextScene4);
        window.show();
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    public void Cfunc(String t){
        textA1.setText(t);
    }
    public void Pfunc(String t){
        textA2.setText(t+" Tk");
    }

}
