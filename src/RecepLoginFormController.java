import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class RecepLoginFormController {
    public AnchorPane recep;
    public TextField userId;
    public PasswordField passwords;

    public void cancelOnAtion(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) recep.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("mainFage.fxml"))));
        stage.centerOnScreen();
    }

int num=0;
    public void loginOnAction(ActionEvent actionEvent) throws IOException {
        String tempPassword=passwords.getText();
        String tempUsername=userId.getText();
        num++;
        if(num<=2) {
            if (tempUsername.equals("20010331") && tempPassword.equals("1234")) {
                new Alert(Alert.AlertType.CONFIRMATION, "Successfully").show();
                Stage stage=(Stage) recep.getScene().getWindow();
                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("receptionistAfterLogin.fxml"))));
                stage.centerOnScreen();
            } else {
                new Alert(Alert.AlertType.WARNING, "Unsuccessfully").show();
            }
        }
        else {
            new Alert(Alert.AlertType.ERROR, "can not try more than 3 time").show();
        }
    }
}
