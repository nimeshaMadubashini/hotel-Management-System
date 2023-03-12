import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminLoginFormController {
    public TextField userId;
    public PasswordField passwords;
    public AnchorPane loginForm;

int num=0;
    public void loginOnAction(ActionEvent actionEvent) throws IOException {
        String tempPassword=passwords.getText();
        String tempUsername=userId.getText();
        num++;
        if(num<=2) {
            if (tempUsername.equals("20011005") && tempPassword.equals("1234")) {
                new Alert(Alert.AlertType.CONFIRMATION, "Successfully").show();
                Stage stage=(Stage) loginForm.getScene().getWindow();
                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("adminAfterLogin.fxml"))));
                stage.centerOnScreen();
            } else {
                new Alert(Alert.AlertType.WARNING, "Unsuccessfully").show();
            }
        }
        else {
            new Alert(Alert.AlertType.ERROR, "can not try more than 3 time").show();
        }
    }

    public void cancelOnAtion(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) loginForm.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("mainFage.fxml"))));
        stage.centerOnScreen();

    }
}
