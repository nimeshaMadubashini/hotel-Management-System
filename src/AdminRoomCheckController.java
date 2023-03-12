import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminRoomCheckController {
    public AnchorPane page2;

    public void hmOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) page2.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("adminHomePage.fxml"))));
        stage.centerOnScreen();
    }

    public void roomOnAction(ActionEvent actionEvent) {
    }

    public void mealOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) page2.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("mealPack.fxml"))));
        stage.centerOnScreen();
    }

    public void addOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) page2.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("addRoom.fxml"))));
        stage.centerOnScreen();
    }

    public void deleteOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) page2.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("roomSave.fxml"))));
        stage.centerOnScreen();
    }

    public void editOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) page2.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("roomSave.fxml"))));
        stage.centerOnScreen();

    }

    public void logOutOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) page2.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("mainFage.fxml"))));
        stage.centerOnScreen();
    }
}
