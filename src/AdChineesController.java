import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdChineesController {
    public AnchorPane page5;

    public TableView<Chinees_Meal> tableView;
    public TableColumn colPackNum;
    public TableColumn colmealOack;

    public Label confrimation;

    public TextField mealpackNum;
    public TextField mealPack;

    static ObservableList<Chinees_Meal> cm= FXCollections.observableArrayList();

    public void BackOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) page5.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("mealPack.fxml"))));
        stage.centerOnScreen();
    }

    public void addOnAction(ActionEvent actionEvent) {
        String packNum=mealpackNum.getText();
        String mlPack=mealPack.getText();
        cm.add(new Chinees_Meal(packNum,mlPack));
        confrimation.setVisible(true);
    }

    public void initialize(){
        colPackNum.setCellValueFactory(new PropertyValueFactory<>("num"));
        colmealOack.setCellValueFactory(new PropertyValueFactory<>("meal"));
        tableView.setItems(AdChineesController.cm);

        tableView.setEditable(true);
        colPackNum.setCellFactory(TextFieldTableCell.forTableColumn());
        colPackNum.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent>() {
            @Override
            public void handle(TableColumn.CellEditEvent event) {
                ((Chinees_Meal)event.getTableView().getItems().get(event.getTablePosition().getRow())).setNum((String) event.getNewValue());
            }
        });

        colmealOack.setCellFactory(TextFieldTableCell.forTableColumn());
        colmealOack.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent>() {
            @Override
            public void handle(TableColumn.CellEditEvent event) {
                ((Chinees_Meal)event.getTableView().getItems().get(event.getTablePosition().getRow())).setMeal((String) event.getNewValue());
            }
        });

    }

    public void deleteOnAction(ActionEvent actionEvent) {
        int selectedId=tableView.getSelectionModel().getSelectedIndex();
        tableView.getItems().remove(selectedId);
    }
}
