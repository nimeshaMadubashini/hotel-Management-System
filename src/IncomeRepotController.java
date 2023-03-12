import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class IncomeRepotController {

    public AnchorPane page;
    public RadioButton rbtnJan;
    public RadioButton rbtnFeb;
    public RadioButton rbtnMarch;
    public RadioButton rbtnJune;
    public RadioButton rbtnMay;
    public RadioButton rbtnApril;
    public RadioButton rbtnAugust;
    public RadioButton rbtnJuly;
    public RadioButton rbtnNov;
    public RadioButton rbnOct;
    public RadioButton rbtnSep;
    public RadioButton rbtndec;
    public RadioButton rbtnAnu;
    
    public TableView tableVeiw;
    public TableColumn colMon;
    public TableColumn colIncome;

    static  ObservableList<income> incomes= FXCollections.observableArrayList();
    public TextField value;
    public ToggleGroup month;

    public void initialize(){
        colMon.setCellValueFactory(new PropertyValueFactory<>("mon"));
        colIncome.setCellValueFactory(new PropertyValueFactory<>("value"));
        tableVeiw.setItems(IncomeRepotController.incomes);
    }

    public void addOnAction(ActionEvent actionEvent) {

//value.setText(String.valueOf(rnd));
        String vl=value.getText();
        String month="January";
        if(rbtnFeb.isSelected()) {
            month = "February";
        }
        else if(rbtnMarch.isSelected()) {
            month = "March";
        }
       else if(rbtnApril.isSelected()) {
            month = "April";
        }
       else if(rbtnMay.isSelected()) {
            month = "May";
        }
       else if(rbtnJune.isSelected()) {
            month = "June";
        }
       else if(rbtnJuly.isSelected()){
           month="July";
        }
        else if(rbtnAugust.isSelected()){
            month="August";
        }
        else if(rbtnSep.isSelected()){
            month="September";
        } else if(rbnOct.isSelected()){
            month="October";
        }
        else if(rbtnNov.isSelected()){
            month="November";
        } else if(rbtndec.isSelected()){
            month="Desember";
        } else if(rbtnAnu.isSelected()){
            month="Anually";
        }
incomes.add(new income(month,vl));



    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) page.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("adminAfterLogin.fxml"))));
        stage.centerOnScreen();
    }
}
