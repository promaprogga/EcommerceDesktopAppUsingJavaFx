package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;


import java.io.*;

public class Grocery extends Controller{

    @FXML
    private Label lb1, lb2, lb3, lb4, lb5, lb6;

    @FXML
    private Text Gnm1;

    @FXML
    private Text Gnm2;

    @FXML
    private Text Gnm3;

    @FXML
    private Text GPr1;

    @FXML
    private Text GPr2;

    @FXML
    private Text GPr3;

    @FXML
    private Text Gnm5;

    @FXML
    private Text Gnm6;

    @FXML
    private Text Gnm4;

    @FXML
    private Button Plus;

    @FXML
    private Button Minus;

    @FXML
    private Button Plus1;

    @FXML
    private Button Plus2;

    @FXML
    private Button Minus1;

    @FXML
    private Button Minus2;

    @FXML
    private Button Minus11;

    @FXML
    private Button Minus12;

    @FXML
    private Button Minus13;

    @FXML
    private Button Plus11;

    @FXML
    private Button Plus12;

    @FXML
    private Button Plus13;

    @FXML
    private Text GPr6;

    @FXML
    private Text GPr5;

    @FXML
    private Text GPr4;


    @FXML
    void PlusBTn1(ActionEvent event) {
        int quant;
        String Label = lb1.getText();
        int i = Integer.parseInt(Label);
        quant = i + 1;
        String q = Integer.toString(quant);
        lb1.setText(q);

    }

    @FXML
    void MinusBTn1(ActionEvent event) {
        int quant1;
        String Label1 = lb1.getText();
        int i1 = Integer.parseInt(Label1);
        quant1 = i1 - 1;
        String q1 = Integer.toString(quant1);
        lb1.setText(q1);

    }

    @FXML
    void PlusBTn2(ActionEvent event) {
        int quant;
        String Label = lb2.getText();
        int i = Integer.parseInt(Label);
        quant = i + 1;
        String q = Integer.toString(quant);
        lb2.setText(q);
    }

    @FXML
    void MinusBTn2(ActionEvent event) {
        int quant1;
        String Label1 = lb2.getText();
        int i1 = Integer.parseInt(Label1);
        quant1 = i1 - 1;
        String q1 = Integer.toString(quant1);
        lb2.setText(q1);

    }

    @FXML
    void PlusBTn3(ActionEvent event) {
        int quant;
        String Label = lb3.getText();
        int i = Integer.parseInt(Label);
        quant = i + 1;
        String q = Integer.toString(quant);
        lb3.setText(q);
    }

    @FXML
    void MinusBTn3(ActionEvent event) {
        int quant1;
        String Label1 = lb3.getText();
        int i1 = Integer.parseInt(Label1);
        quant1 = i1 - 1;
        String q1 = Integer.toString(quant1);
        lb3.setText(q1);

    }

    @FXML
    void PlusBTn4(ActionEvent event) {
        int quant;
        String Label = lb4.getText();
        int i = Integer.parseInt(Label);
        quant = i + 1;
        String q = Integer.toString(quant);
        lb4.setText(q);
    }

    @FXML
    void MinusBTn4(ActionEvent event) {
        int quant1;
        String Label1 = lb4.getText();
        int i1 = Integer.parseInt(Label1);
        quant1 = i1 - 1;
        String q1 = Integer.toString(quant1);
        lb4.setText(q1);

    }

    @FXML
    void PlusBTn5(ActionEvent event) {
        int quant;
        String Label = lb5.getText();
        int i = Integer.parseInt(Label);
        quant = i + 1;
        String q = Integer.toString(quant);
        lb5.setText(q);
    }

    @FXML
    void MinusBTn5(ActionEvent event) {
        int quant1;
        String Label1 = lb5.getText();
        int i1 = Integer.parseInt(Label1);
        quant1 = i1 - 1;
        String q1 = Integer.toString(quant1);
        lb5.setText(q1);

    }

    @FXML
    void PlusBTn6(ActionEvent event) {
        int quant;
        String Label = lb6.getText();
        int i = Integer.parseInt(Label);
        quant = i + 1;
        String q = Integer.toString(quant);
        lb6.setText(q);
    }

    @FXML
    void MinusBTn6(ActionEvent event) {
        int quant1;
        String Label1 = lb6.getText();
        int i1 = Integer.parseInt(Label1);
        quant1 = i1 - 1;
        String q1 = Integer.toString(quant1);
        lb6.setText(q1);

    }



    @FXML
    void GbtnAction1(ActionEvent event) throws IOException {
        String name = Gnm1.getText();
        String price = GPr1.getText();
        String quant = lb1.getText();
        file(name, price, quant);
        int p = Integer.parseInt(price);
        int q = Integer.parseInt(quant);
        file1(q, p);
    }

    @FXML
    void GbtnAction2(ActionEvent event) {
        String name = Gnm2.getText();
        String price = GPr2.getText();
        String quant = lb2.getText();
        file(name, price, quant);
        int p = Integer.parseInt(price);
        int q = Integer.parseInt(quant);
        file1(q, p);
    }

    @FXML
    void GbtnAction3(ActionEvent event) {
        String name = Gnm3.getText();
        String price = GPr3.getText();
        String quant = lb3.getText();
        file(name, price, quant);
        int p = Integer.parseInt(price);
        int q = Integer.parseInt(quant);
        file1(q, p);
    }

    @FXML
    void GbtnAction4(ActionEvent event) {
        String name = Gnm4.getText();
        String price = GPr4.getText();
        String quant = lb4.getText();
        file(name, price, quant);
        int p = Integer.parseInt(price);
        int q = Integer.parseInt(quant);
        file1(q, p);
    }

    @FXML
    void GbtnAction5(ActionEvent event) {
        String name = Gnm5.getText();
        String price = GPr5.getText();
        String quant = lb5.getText();
        file(name, price, quant);
        int p = Integer.parseInt(price);
        int q = Integer.parseInt(quant);
        file1(q, p);
    }

    @FXML
    void GbtnAction6(ActionEvent event) {
        String name = Gnm6.getText();
        String price = GPr6.getText();
        String quant = lb6.getText();
        file(name, price, quant);
        int p = Integer.parseInt(price);
        int q = Integer.parseInt(quant);
        file1(q, p);
    }




}
