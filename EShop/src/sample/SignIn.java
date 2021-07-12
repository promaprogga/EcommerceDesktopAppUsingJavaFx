package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class SignIn extends Controller{


    @FXML
    private TextField InTextName;

    @FXML
    private TextField InTextPass;

    @FXML
    private Button signInbtn;

    @FXML
    private Button signUpbtn;



    @FXML
    void SignInBtn(ActionEvent event) throws IOException {
        try{
            File file = new File("info.txt");
            Scanner scan = new Scanner(file);
            String email;
            String pass;
            boolean f = false;
            while(scan.hasNext()){
                email=scan.next();
                pass=scan.next();
                if(email.equals(InTextName.getText()) && (pass.equals(InTextPass.getText()))){
                    Parent root2 = FXMLLoader.load(getClass().getResource("Home.fxml"));
                    Scene nextScene2 = new Scene(root2, 580, 450);
                    window.setTitle("ESHOP");
                    window.setScene(nextScene2);
                    window.show();
                    f=true;
                }

            }if (f==false){
                JOptionPane.showMessageDialog(null, "Wrong Username/Password! Try Again?", "WARNING!!", JOptionPane.WARNING_MESSAGE);

            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }



    @FXML
    void SignUpBtn(ActionEvent event) throws IOException {
        Parent root1 = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
        Scene nextScene1 = new Scene(root1, 600, 400);
        window.setTitle("ESHOP");
        window.setScene(nextScene1);
        window.show();


    }

}
