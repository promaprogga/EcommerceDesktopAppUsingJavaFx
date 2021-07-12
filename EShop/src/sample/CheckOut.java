package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;

import java.io.*;
import java.net.Socket;

public class CheckOut extends Controller {
    @FXML
    private TextField name;

    @FXML
    private TextField address;

    @FXML
    private TextField phone;

    private BufferedWriter writers;
    private BufferedReader reader;

    public CheckOut(){
        try {
            Socket socket = new Socket("127.0.0.1", 3211);

            OutputStreamWriter os= new OutputStreamWriter(socket.getOutputStream());
            writers= new BufferedWriter(os);

            InputStreamReader is=new InputStreamReader(socket.getInputStream());
            reader= new BufferedReader(is);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void FinalLoad() throws IOException {
        Parent rootCheck= FXMLLoader.load(getClass().getResource("Final.fxml"));
        Scene nextScene4 = new Scene(rootCheck, 350, 320);
        window.setTitle("ESHOP");
        window.setScene(nextScene4);
        window.show();
        clearFile();
    }

    public void clearFile() throws IOException {
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

    }

    @FXML
    void CheckBtn(ActionEvent event) throws IOException {
        String Address= name.getText() + "\n";
        String Phone= phone.getText() + "\n";
        writers.write("Address: " +Address+  "Phone No. " +Phone + "Items:\n"+fileReadCart());
        writers.flush();
        FinalLoad();

    }

    @FXML
    void eShop(ActionEvent event) throws IOException {
        Parent root2 = FXMLLoader.load(getClass().getResource("Home.fxml"));
        Scene nextScene2= new Scene(root2, 600, 450);
        window.setTitle("ESHOP");
        window.setScene(nextScene2);
        window.show();
    }
}
