import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class ReserveRoomController{
    public RadioButton rbtnSingle;
    public RadioButton rbtnTriple;
    public RadioButton rbtnQuard;


    public RadioButton rbtnDouble;
    
    public TextField name;
    public TextField add;
    public TextField nic;
    public TextField email;
    public TextField tele;
    public TextField checkOut;
    public TextField checkIN;
    public RadioButton rbtnLocla;
    public RadioButton rbtnChinees;
    public RadioButton rbtnFrench;
    public TextField rmNumber;

    public Label confrimation;

    public AnchorPane cus;

    static ObservableList<Customer> customers= FXCollections.observableArrayList();
    public ToggleGroup meal;
    int rnd;
    public void searchOnAction(ActionEvent actionEvent) {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        rnd = random.nextInt(1, 25);
        if (rbtnSingle.isSelected()) {
            rmNumber.setText(String.valueOf(rnd));
        } else if (rbtnDouble.isSelected()) {
rmNumber.setText(String.valueOf(rnd));
        } else if (rbtnTriple.isSelected()) {
        rmNumber.setText(String.valueOf(rnd));
    } else if (rbtnQuard.isSelected()) {
        rmNumber.setText(String.valueOf(rnd));
    }
    }
    public void dataOnClicked(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) cus.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("CustomerInfo.fxml"))));
        stage.centerOnScreen();
    }

    public void addOnAction(ActionEvent actionEvent) {
        String nme=name.getText();
        String id=nic.getText();
        String ad=add.getText();
        String mail=email.getText();
        String tel=tele.getText();
        String cin=checkIN.getText();
        String cOut=checkOut.getText();
        String mplan;
        mplan=("Local Food");
        if(rbtnChinees.isSelected()){
            mplan=("Chinees Food");
        }else if (rbtnFrench.isSelected()){
            mplan=("French Food");
        }
        String rmnum=rmNumber.getText();
        customers.add(new Customer(nme,id,ad,mail,tel,cin,cOut,mplan,rmnum));
        confrimation.setVisible(true);
    }

    public void backToOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) cus.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("receptionistAfterLogin.fxml"))));
        stage.centerOnScreen();
    }
}


