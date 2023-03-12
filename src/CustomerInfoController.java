import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class CustomerInfoController {
    public TableView tableView;
    public TableColumn colNmae;
    public TableColumn colAdd;
    public TableColumn colEmail;
    public TableColumn colTele;
    public TableColumn colNic;
    public TableColumn colchin;
    public TableColumn colCheckOut;
    public TableColumn colMeal;
    public TableColumn colRNum;
    public AnchorPane page;

    public void initialize(){
        colNmae.setCellValueFactory(new PropertyValueFactory<>("name"));
        colNic.setCellValueFactory(new PropertyValueFactory<>("nic"));
        colAdd.setCellValueFactory(new PropertyValueFactory<>("add"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        colTele.setCellValueFactory(new PropertyValueFactory<>("tele"));
        colchin.setCellValueFactory(new PropertyValueFactory<>("checkIn"));
        colCheckOut.setCellValueFactory(new PropertyValueFactory<>("checkOut"));
        colMeal.setCellValueFactory(new PropertyValueFactory<>("meal"));
        colRNum.setCellValueFactory(new PropertyValueFactory<>("rmNum"));
        tableView.setItems(ReserveRoomController.customers);

        tableView.setEditable(true);
        colNmae.setCellFactory(TextFieldTableCell.forTableColumn());
        colNmae.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent>() {
            @Override
            public void handle(TableColumn.CellEditEvent event) {
                ((Customer)event.getTableView().getItems().get(event.getTablePosition().getRow())).setName((String) event.getNewValue());
            }
        });

        colNic.setCellFactory(TextFieldTableCell.forTableColumn());
        colNic.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent>() {
            @Override
            public void handle(TableColumn.CellEditEvent event) {
                ((Customer)event.getTableView().getItems().get(event.getTablePosition().getRow())).setNic((String) event.getNewValue());
            }
        });

        colAdd.setCellFactory(TextFieldTableCell.forTableColumn());
        colAdd.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent>() {
            @Override
            public void handle(TableColumn.CellEditEvent event) {
                ((Customer)event.getTableView().getItems().get(event.getTablePosition().getRow())).setAdd((String) event.getNewValue());
            }
        });

        colEmail.setCellFactory(TextFieldTableCell.forTableColumn());
        colEmail.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent>() {
            @Override
            public void handle(TableColumn.CellEditEvent event) {
                ((Customer)event.getTableView().getItems().get(event.getTablePosition().getRow())).setEmail((String) event.getNewValue());
            }
        });

        colTele.setCellFactory(TextFieldTableCell.forTableColumn());
        colTele.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent>() {
            @Override
            public void handle(TableColumn.CellEditEvent event) {
                ((Customer)event.getTableView().getItems().get(event.getTablePosition().getRow())).setTele((String) event.getNewValue());
            }
        });

        colMeal.setCellFactory(TextFieldTableCell.forTableColumn());
        colMeal.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent>() {
            @Override
            public void handle(TableColumn.CellEditEvent event) {
                ((Customer)event.getTableView().getItems().get(event.getTablePosition().getRow())).setMeal((String) event.getNewValue());
            }
        });

        colRNum.setCellFactory(TextFieldTableCell.forTableColumn());
        colRNum.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent>() {
            @Override
            public void handle(TableColumn.CellEditEvent event) {
                ((Customer)event.getTableView().getItems().get(event.getTablePosition().getRow())).setRmNum((String) event.getNewValue());
            }
        });

        colchin.setCellFactory(TextFieldTableCell.forTableColumn());
        colchin.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent>() {
            @Override
            public void handle(TableColumn.CellEditEvent event) {
                ((Customer)event.getTableView().getItems().get(event.getTablePosition().getRow())).setCheckIn((String) event.getNewValue());
            }
        });

        colCheckOut.setCellFactory(TextFieldTableCell.forTableColumn());
        colCheckOut.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent>() {
            @Override
            public void handle(TableColumn.CellEditEvent event) {
                ((Customer)event.getTableView().getItems().get(event.getTablePosition().getRow())).setCheckOut((String) event.getNewValue());
            }
        });
    }



    public void deleteOnAction(ActionEvent actionEvent) {
        int selectedId=tableView.getSelectionModel().getSelectedIndex();
        tableView.getItems().remove(selectedId);
    }

    public void BackOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) page.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("reserveRoom.fxml"))));
        stage.centerOnScreen();
    }
}
