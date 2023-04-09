package com.example.sdmproject.Controller;

import com.example.sdmproject.MainApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

import java.io.IOException;

public class SelectScreenController {
    String[] sListItems = new String[]{
            "1","2","3","4","5"};
    @FXML
    public ComboBox<String> selectionList;
    public double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void initialize(){
        selectionList.getItems().setAll(sListItems);
    }

    public void onClickNext(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/sdmproject/Payment.fxml"));
        Scene scene= new Scene(fxmlLoader.load());
        PaymentController paymentController  = fxmlLoader.getController();
        String selectedValue = selectionList.getValue();
        if(selectedValue == null){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Warning");
            alert.setHeaderText("Please select number of ticket.");
            alert.showAndWait();
            return;
        }
        Double total = Double.parseDouble(selectedValue) * amount;
        paymentController.setAmount(total+"");
        Stage stage = MainApplication.getPrimarystage();

        stage.setTitle("Payment");
        stage.setScene(scene);
        stage.show();
    }

    public void onClickBack(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/sdmproject/MainMenu.fxml"));
        Scene scene= new Scene(fxmlLoader.load());
        Stage stage = MainApplication.getPrimarystage();
        stage.setTitle("Main Menu");
        stage.setScene(scene);
        stage.show();
    }
}
