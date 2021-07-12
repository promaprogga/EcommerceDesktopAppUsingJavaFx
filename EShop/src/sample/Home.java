package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Home extends Controller{


    @FXML
    void GroceryBtn(ActionEvent event) throws IOException {
        Parent rootGrocery = FXMLLoader.load(getClass().getResource("Grocery.fxml"));
        Scene nextScene1= new Scene(rootGrocery, 600, 550);
        window.setTitle("ESHOP");
        window.setScene(nextScene1);
        window.show();
    }
    @FXML
    void BooksBtn(ActionEvent event) throws IOException {
        Parent rootBook= FXMLLoader.load(getClass().getResource("Books.fxml"));
        Scene nextScene2 = new Scene(rootBook, 600, 550);
        window.setTitle("ESHOP");
        window.setScene(nextScene2);
        window.show();

    }

}
