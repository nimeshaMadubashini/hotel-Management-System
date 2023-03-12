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

public class AdFrencgFoodController {
    public AnchorPane page6;
    public TextField mealpackNum;
    public TextField mealPack;

    public TableView<French_Meal> tableView;
    public TableColumn colPackNum;
    public TableColumn colmealOack;

    public Label confrimation;

    static ObservableList<French_Meal> fc= FXCollections.observableArrayList();

    public void BackOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) page6.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("mealPack.fxml"))));
        stage.centerOnScreen();
    }

    public void addOnAction(ActionEvent actionEvent) {
        String packNum=mealpackNum.getText();
        String mlPack=mealPack.getText();
        fc.add(new French_Meal(packNum,mlPack));
        confrimation.setVisible(true);
    }

    public void initialize(){
        colPackNum.setCellValueFactory(new PropertyValueFactory<>("num"));
        colmealOack.setCellValueFactory(new PropertyValueFactory<>("meal"));
        tableView.setItems(AdFrencgFoodController.fc);

        tableView.setEditable(true);
        colPackNum.setCellFactory(TextFieldTableCell.forTableColumn());
        colPackNum.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent>() {
            @Override
            public void handle(TableColumn.CellEditEvent event) {
                ((French_Meal)event.getTableView().getItems().get(event.getTablePosition().getRow())).setNum((String) event.getNewValue());
            }
        });
        colmealOack.setCellFactory(TextFieldTableCell.forTableColumn());
        colmealOack.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent>() {
            @Override
            public void handle(TableColumn.CellEditEvent event) {
                ((French_Meal)event.getTableView().getItems().get(event.getTablePosition().getRow())).setMeal((String) event.getNewValue());
            }
        });
    }

    public void deleteOnAction(ActionEvent actionEvent) {
        int selectedId=tableView.getSelectionModel().getSelectedIndex();
        tableView.getItems().remove(selectedId);
    }
}
