package com.example.sdmproject.Controller;

import com.example.sdmproject.Data;
import com.example.sdmproject.MainApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class PaymentController {
    @FXML
    public Label amount;
    public boolean rechargeFlow = false;
    public void setAmount(String amount) {
        this.amount.setText(amount);
    }

    public boolean isRechargeFlow() {
        return rechargeFlow;
    }

    public void setRechargeFlow(boolean rechargeFlow) {
        this.rechargeFlow = rechargeFlow;
    }

    public void onBackButtonClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/sdmproject/MainMenu.fxml"));
        Scene scene= new Scene(fxmlLoader.load());
        Stage stage = MainApplication.getPrimarystage();
        stage.setTitle("Main Screen");
        stage.setScene(scene);
        stage.show();
    }

    public void onClickPayWithDebit(ActionEvent actionEvent) throws IOException {
        String str = amount.getText();
        if(rechargeFlow ==true){
            Data data= Data.getInstance();
            double balance = data.getBalance() + Double.parseDouble(amount.getText());
            data.setBalance(balance);
            rechargeFlow = false;
        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Processing");
        alert.setHeaderText("Processing payment.");
        alert.showAndWait();
        alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success!");
        alert.setHeaderText("Please collect your tickets or OPUS card. Have a great day!!");
        alert.showAndWait();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/sdmproject/MainApplication.fxml"));
        Scene scene= new Scene(fxmlLoader.load());
        Stage stage = MainApplication.getPrimarystage();
        stage.setTitle("Main Screen");
        stage.setScene(scene);
        stage.show();
    }


}
