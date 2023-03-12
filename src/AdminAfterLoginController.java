import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminAfterLoginController {
    public AnchorPane homePage;

    public void hmOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) homePage.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("adminHomePage.fxml"))));
        stage.centerOnScreen();
    }

    public void roomOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) homePage.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("adminRoomCheck.fxml"))));
        stage.centerOnScreen();
    }

    public void mealOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) homePage.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("mealPack.fxml"))));
        stage.centerOnScreen();

    }

    public void incomeOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) homePage.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("incomeRepot.fxml"))));
        stage.centerOnScreen();
    }
}
