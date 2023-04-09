package com.example.sdmproject.Controller;

import com.example.sdmproject.Data;
import com.example.sdmproject.MainApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class OpusHolderScreenController {
    public void onClickTripsinZoneA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/sdmproject/Payment.fxml"));
        Scene scene= new Scene(fxmlLoader.load());
        PaymentController paymentController  = fxmlLoader.getController();
        paymentController.setAmount("90.0");
        Stage stage = MainApplication.getPrimarystage();
        stage.setTitle("Payment");
        stage.setScene(scene);
        stage.show();
    }

    public void onClickTripsinZoneAB(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/sdmproject/Payment.fxml"));
        Scene scene= new Scene(fxmlLoader.load());
        PaymentController paymentController  = fxmlLoader.getController();
        paymentController.setAmount("100.0");
        Stage stage = MainApplication.getPrimarystage();
        stage.setTitle("Payment");
        stage.setScene(scene);
        stage.show();
    }

    public void onClickTripsinZoneAC(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/sdmproject/Payment.fxml"));
        Scene scene= new Scene(fxmlLoader.load());
        PaymentController paymentController  = fxmlLoader.getController();
        paymentController.setAmount("105.0");
        Stage stage = MainApplication.getPrimarystage();
        stage.setTitle("Payment");
        stage.setScene(scene);
        stage.show();
    }

    public void onClickTripsinZoneABC(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/sdmproject/Payment.fxml"));
        Scene scene= new Scene(fxmlLoader.load());
        PaymentController paymentController  = fxmlLoader.getController();
        paymentController.setAmount("115.0");
        Stage stage = MainApplication.getPrimarystage();
        stage.setTitle("Payment");
        stage.setScene(scene);
        stage.show();
    }

    public void onClickBlockMyOPUS(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/sdmproject/BlockOPUS.fxml"));
        Scene scene= new Scene(fxmlLoader.load());

        Stage stage = MainApplication.getPrimarystage();
        stage.setTitle("Block My OPUS");
        stage.setScene(scene);
        stage.show();
    }

    public void onClickRechargeOPUS(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/sdmproject/OPUSRecharge.fxml"));
        Scene scene= new Scene(fxmlLoader.load());
        Data data = Data.getInstance();
        double currentBalance = data.getBalance();
        OPUSRechargeController opusRechargeController = fxmlLoader.getController();
        opusRechargeController.setCurrentBalance(currentBalance);

        Stage stage = MainApplication.getPrimarystage();
        stage.setTitle("Recharge OPUS");
        stage.setScene(scene);
        stage.show();

    }

    public void onClickBackController(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/sdmproject/MainMenu.fxml"));
        Scene scene= new Scene(fxmlLoader.load());

        Stage stage = MainApplication.getPrimarystage();
        stage.setTitle("Main Menu");
        stage.setScene(scene);
        stage.show();
    }
}
