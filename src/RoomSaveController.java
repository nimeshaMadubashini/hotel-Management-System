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
import javafx.scene.control.cell.TextFieldTreeTableCell;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class RoomSaveController extends AddRoomController {
    //private static ObservableList<Room> rooms;

    public TableView<Room> tableView;

    public TableColumn colRmNum;

    public TableColumn colBedCp;

    public TableColumn colPrice;

    public TableColumn colRmStatus;

    public AnchorPane pageTable;


    public void initialize(){
       colRmNum.setCellValueFactory(new PropertyValueFactory<>("rmNum"));
        colBedCp.setCellValueFactory(new PropertyValueFactory<>("bedCp"));
        colPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        colRmStatus.setCellValueFactory(new PropertyValueFactory<>("rmStatus"));
       // AddRoomController.rm.add(new Room("011","4","1000","Available"));
        tableView.setItems(AddRoomController.rm);

        tableView.setEditable(true);
        colRmNum.setCellFactory(TextFieldTableCell.forTableColumn());
        colRmNum.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent>() {
            @Override
            public void handle(TableColumn.CellEditEvent event) {
                ((Room)event.getTableView().getItems().get(event.getTablePosition().getRow())).setRmNum((String) event.getNewValue());
            }
        });

        colBedCp.setCellFactory(TextFieldTableCell.forTableColumn());
        colBedCp.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent>() {
            @Override
            public void handle(TableColumn.CellEditEvent event) {
                ((Room)event.getTableView().getItems().get(event.getTablePosition().getRow())).setBedCp((String) event.getNewValue());
            }
        });

        colPrice.setCellFactory(TextFieldTableCell.forTableColumn());
        colPrice.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent>() {
            @Override
            public void handle(TableColumn.CellEditEvent event) {
                ((Room)event.getTableView().getItems().get(event.getTablePosition().getRow())).setPrice((String) event.getNewValue());
            }
        });

        colRmStatus.setCellFactory(TextFieldTableCell.forTableColumn());
        colRmStatus.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent>() {
            @Override
            public void handle(TableColumn.CellEditEvent event) {
                ((Room)event.getTableView().getItems().get(event.getTablePosition().getRow())).setRmStatus((String) event.getNewValue());
            }
        });

    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) pageTable.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("addRoom.fxml"))));
        stage.centerOnScreen();
    }

    public void deleteOnAction(ActionEvent actionEvent) {
        int selectedId=tableView.getSelectionModel().getSelectedIndex();
        tableView.getItems().remove(selectedId);
    }

}
