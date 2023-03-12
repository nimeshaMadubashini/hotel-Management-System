import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MealPackController {
    public AnchorPane page3;

    public void homeOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) page3.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("adminHomePage.fxml"))));
        stage.centerOnScreen();
    }

    public void rmOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) page3.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("adminRoomCheck.fxml"))));
        stage.centerOnScreen();
    }

    public void melOnAction(ActionEvent actionEvent) {
    }

    public void localOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) page3.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("adlocalMeal.fxml"))));
        stage.centerOnScreen();
    }

    public void chineesOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) page3.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("adChinees.fxml"))));
        stage.centerOnScreen();
    }

    public void frenchOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) page3.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("adFrencgFood.fxml"))));
        stage.centerOnScreen();
    }

    public void logOutOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) page3.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("mainFage.fxml"))));
        stage.centerOnScreen();
    }
}
