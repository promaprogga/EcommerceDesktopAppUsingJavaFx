package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

public class Books extends Controller{


    @FXML
    private Text Bnm1;

    @FXML
    private Text Bnm4;

    @FXML
    private Text Bnm2;

    @FXML
    private Text Bnm3;

    @FXML
    private Text Bnm5;

    @FXML
    private Text BPr3;

    @FXML
    private Label Blb1;

    @FXML
    private Label Blb5;

    @FXML
    private Label Blb4;

    @FXML
    private Label Blb2;

    @FXML
    private Label Blb3;

    @FXML
    private Text BPr5;

    @FXML
    private Text BPr4;

    @FXML
    private Text BPr2;

    @FXML
    private Text BPr1;

    @FXML
    void BMinus1(ActionEvent event) {
        int quant1;
        String Label1 = Blb1.getText();
        int i1 = Integer.parseInt(Label1);
        quant1 = i1 - 1;
        String q1 = Integer.toString(quant1);
        Blb1.setText(q1);
    }

    @FXML
    void BMinus2(ActionEvent event) {
        int quant1;
        String Label1 = Blb2.getText();
        int i1 = Integer.parseInt(Label1);
        quant1 = i1 - 1;
        String q1 = Integer.toString(quant1);
        Blb2.setText(q1);
    }

    @FXML
    void BMinus3(ActionEvent event) {
        int quant1;
        String Label1 = Blb3.getText();
        int i1 = Integer.parseInt(Label1);
        quant1 = i1 - 1;
        String q1 = Integer.toString(quant1);
        Blb3.setText(q1);
    }

    @FXML
    void BMinus4(ActionEvent event) {
        int quant1;
        String Label1 = Blb4.getText();
        int i1 = Integer.parseInt(Label1);
        quant1 = i1 - 1;
        String q1 = Integer.toString(quant1);
        Blb4.setText(q1);
    }

    @FXML
    void BMinus5(ActionEvent event) {
        int quant1;
        String Label1 = Blb5.getText();
        int i1 = Integer.parseInt(Label1);
        quant1 = i1 - 1;
        String q1 = Integer.toString(quant1);
        Blb5.setText(q1);
    }

    @FXML
    void BPlus1(ActionEvent event) {
        int quant;
        String Label = Blb1.getText();
        int i = Integer.parseInt(Label);
        quant = i + 1;
        String q = Integer.toString(quant);
        Blb1.setText(q);
    }

    @FXML
    void BPlus2(ActionEvent event) {
        int quant;
        String Label = Blb2.getText();
        int i = Integer.parseInt(Label);
        quant = i + 1;
        String q = Integer.toString(quant);
        Blb2.setText(q);
    }

    @FXML
    void BPlus3(ActionEvent event) {
        int quant;
        String Label = Blb3.getText();
        int i = Integer.parseInt(Label);
        quant = i + 1;
        String q = Integer.toString(quant);
        Blb3.setText(q);
    }

    @FXML
    void BPlus4(ActionEvent event) {
        int quant;
        String Label = Blb4.getText();
        int i = Integer.parseInt(Label);
        quant = i + 1;
        String q = Integer.toString(quant);
        Blb4.setText(q);
    }

    @FXML
    void BPlus5(ActionEvent event) {
        int quant;
        String Label = Blb5.getText();
        int i = Integer.parseInt(Label);
        quant = i + 1;
        String q = Integer.toString(quant);
        Blb5.setText(q);
    }

    @FXML
    void BbtnAction1(ActionEvent event) {
        String name = Bnm1.getText();
        String price = BPr1.getText();
        String quant = Blb1.getText();
        file(name, price, quant);
        int p = Integer.parseInt(price);
        int q = Integer.parseInt(quant);
        file2(q, p);
    }

    @FXML
    void BbtnAction2(ActionEvent event) {
        String name = Bnm2.getText();
        String price = BPr2.getText();
        String quant = Blb2.getText();
        file(name, price, quant);
        int p = Integer.parseInt(price);
        int q = Integer.parseInt(quant);
        file2(q, p);
    }

    @FXML
    void BbtnAction3(ActionEvent event) {
        String name = Bnm3.getText();
        String price = BPr3.getText();
        String quant = Blb3.getText();
        file(name, price, quant);
        int p = Integer.parseInt(price);
        int q = Integer.parseInt(quant);
        file2(q, p);
    }

    @FXML
    void BbtnAction4(ActionEvent event) {
        String name = Bnm4.getText();
        String price = BPr4.getText();
        String quant = Blb4.getText();
        file(name, price, quant);
        int p = Integer.parseInt(price);
        int q = Integer.parseInt(quant);
        file2(q, p);
    }

    @FXML
    void BbtnAction5(ActionEvent event) {
        String name = Bnm5.getText();
        String price = BPr5.getText();
        String quant = Blb5.getText();
        file(name, price, quant);
        int p = Integer.parseInt(price);
        int q = Integer.parseInt(quant);
        file2(q, p);
    }

}
