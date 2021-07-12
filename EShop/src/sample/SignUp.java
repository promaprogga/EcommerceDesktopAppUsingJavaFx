package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SignUp extends Controller{
    @FXML
    private AnchorPane sign_In;

    @FXML
    private TextField UpTextName;

    @FXML
    private TextField UpTextEmail;

    @FXML
    private TextField UpTextPass;

    @FXML
    private Button Sign_Up;


    public void form(){

    }

    @FXML
    void Sign_Up(ActionEvent event) throws IOException {

        String name= UpTextName.getText();
        String email= UpTextEmail.getText();
        String pass= UpTextPass.getText();

        if(name.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Name Empty", "WARNING!!", JOptionPane.WARNING_MESSAGE);
        }
        else if(email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Email Empty", "WARNING!!", JOptionPane.WARNING_MESSAGE);
        }
        else if(pass.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Password Empty", "WARNING!!", JOptionPane.WARNING_MESSAGE);
        }
        else {
            try {
                FileWriter myWriter = new FileWriter("info.txt", true);
                BufferedWriter writer = new BufferedWriter(myWriter);
                writer.append(name+"\n"+pass+"\n");
                writer.newLine();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root2 = FXMLLoader.load(getClass().getResource("Home.fxml"));
            Scene nextScene2= new Scene(root2, 580, 450);
            window.setTitle("ESHOP");
            window.setScene(nextScene2);
            window.show();

        }

    }

}
