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

public class AdlocalMealController {
    public AnchorPane page4;

    public TableView<Local_Meal>tableView;

    public TableColumn colPackNum;
    
    public TableColumn colmealOack;
    
    public TextField mealpackNum;

    public TextField mealPack;


static ObservableList<Local_Meal> lc=FXCollections.observableArrayList();
    public Label confrimation;

    public void BackOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) page4.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("mealPack.fxml"))));
        stage.centerOnScreen();
    }

    public void initialize(){
        colPackNum.setCellValueFactory(new PropertyValueFactory<>("packNum"));
        colmealOack.setCellValueFactory(new PropertyValueFactory<>("mealPack"));
        tableView.setItems(AdlocalMealController.lc);

        tableView.setEditable(true);
        colPackNum.setCellFactory(TextFieldTableCell.forTableColumn());
        colPackNum.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent>() {
            @Override
            public void handle(TableColumn.CellEditEvent event) {
                ((Local_Meal)event.getTableView().getItems().get(event.getTablePosition().getRow())).setPackNum((String) event.getNewValue());
            }
        });

        colmealOack.setCellFactory(TextFieldTableCell.forTableColumn());
        colmealOack.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent>() {
            @Override
            public void handle(TableColumn.CellEditEvent event) {
                ((Local_Meal)event.getTableView().getItems().get(event.getTablePosition().getRow())).setMealPack((String) event.getNewValue());
            }
        });
    }

    public void addOnAction(ActionEvent actionEvent) {
        String num=mealpackNum.getText();
        String mael=mealPack.getText();
        lc.add(new Local_Meal(num,mael));
        confrimation.setVisible(true);
    }

    public void deleteOnAction(ActionEvent actionEvent) {
        int selectedId=tableView.getSelectionModel().getSelectedIndex();
        tableView.getItems().remove(selectedId);
    }
}
