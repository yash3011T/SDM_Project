package com.example.sdmproject.Controller;

import com.example.sdmproject.MainApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class OPUSRechargeController {
    public Label currentBalance;
    public TextField amountTextField;
    public void setCurrentBalance(double amount){
        currentBalance.setText(amount+"");
    }

    public void onClickBackController(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/sdmproject/OpusHolderScreen.fxml"));
        Scene scene= new Scene(fxmlLoader.load());

        Stage stage = MainApplication.getPrimarystage();
        stage.setTitle("OPUS");
        stage.setScene(scene);
        stage.show();
    }

    public void onClickRechargeController(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/sdmproject/Payment.fxml"));
        Scene scene= new Scene(fxmlLoader.load());
        if(Double.parseDouble(amountTextField.getText()) <=0){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error!");
            alert.setHeaderText("Enter valid amount.");
            alert.showAndWait();
            return;
        }
        PaymentController paymentController  = fxmlLoader.getController();
        paymentController.setAmount(amountTextField.getText());
        paymentController.setRechargeFlow(true);
        Stage stage = MainApplication.getPrimarystage();
        stage.setTitle("Payment");
        stage.setScene(scene);
        stage.show();
    }
}
