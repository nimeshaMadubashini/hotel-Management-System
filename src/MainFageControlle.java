import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainFageControlle {

    public AnchorPane mainPage;


    public void receptionistOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) mainPage.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("recepLoginForm.fxml"))));
        stage.centerOnScreen();

    }

    public void adminOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) mainPage.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("adminLoginForm.fxml"))));
        stage.centerOnScreen();

    }
}
