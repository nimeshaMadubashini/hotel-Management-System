import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ReceptionistAfterLoginController {
    public AnchorPane page1;

    public void homeOnAction(ActionEvent actionEvent) {
    }

    public void reserveOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) page1.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("reserveRoom.fxml"))));
        stage.centerOnScreen();
    }

    public void maintainOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) page1.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("maintananceRoom.fxml"))));
        stage.centerOnScreen();

    }

    public void logOutOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) page1.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("mainFage.fxml"))));
        stage.centerOnScreen();
    }
}
