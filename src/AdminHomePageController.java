import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminHomePageController {
    public AnchorPane page1;


    public void hmOnAction(ActionEvent actionEvent) {

    }

    public void roomOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) page1.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("adminRoomCheck.fxml"))));
        stage.centerOnScreen();
    }

    public void mealOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) page1.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("mealPack.fxml"))));
        stage.centerOnScreen();
    }
}
