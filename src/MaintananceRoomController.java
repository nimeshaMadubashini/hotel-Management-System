import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MaintananceRoomController {
    public TextField roomNum;
    public TextField description;
    public TextField status;

    public TableColumn colNum;
    public TableColumn colDesc;
    public TableColumn colStatus;

    public TableView tableView;

    static ObservableList<Maintain> maintains= FXCollections.observableArrayList();
    public AnchorPane page;

    public void initialize(){

        colNum.setCellValueFactory(new PropertyValueFactory<>("roomNum"));
        colDesc.setCellValueFactory(new PropertyValueFactory<>("descrption"));
        colStatus.setCellValueFactory(new PropertyValueFactory<>("status"));
        tableView.setItems(MaintananceRoomController.maintains);

        tableView.setEditable(true);
        colStatus.setCellFactory(TextFieldTableCell.forTableColumn());
        colStatus.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent>() {
            @Override
            public void handle(TableColumn.CellEditEvent event) {
                ((Maintain)event.getTableView().getItems().get(event.getTablePosition().getRow())).setStatus((String) event.getNewValue());
            }
        });
    }

    public void addOnAcion(ActionEvent actionEvent) {
        String rm=roomNum.getText();
        String desc=description.getText();
        String st=status.getText();
        maintains.add(new Maintain(rm,desc,st));

    }

    public void deleteOnAction(ActionEvent actionEvent) {
        int selectedId=tableView.getSelectionModel().getSelectedIndex();
        tableView.getItems().remove(selectedId);
    }

    public void backToOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) page.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("receptionistAfterLogin.fxml"))));
        stage.centerOnScreen();


    }
}
