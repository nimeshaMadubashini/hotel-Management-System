import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AddRoomController {
    public TextField roomId;
    public TextField bedcapa;
    public TextField price;
    public TextField roomStatus;
    public AnchorPane pageadd;

    static ObservableList<Room> rm=FXCollections.observableArrayList();
    public Label confrination;


    public void SavaOnAction(ActionEvent actionEvent) {
        String roomid=roomId.getText();
        String bed=bedcapa.getText();
        String pr=price.getText();
        String rms=roomStatus.getText();
        rm.add(new Room(roomid,bed,pr,rms));
        confrination.setVisible(true);
    }
    public void dataOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) pageadd.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("roomSave.fxml"))));
        stage.centerOnScreen();
    }

    public void backToHomeOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) pageadd.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("adminRoomCheck.fxml"))));
        stage.centerOnScreen();
    }
}
