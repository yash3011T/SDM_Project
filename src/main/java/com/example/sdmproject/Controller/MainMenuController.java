package com.example.sdmproject.Controller;

import com.example.sdmproject.MainApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainMenuController {
    public void onOPUSButtonClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/sdmproject/OpusHolderScreen.fxml"));
        Scene scene= new Scene(fxmlLoader.load());
        Stage stage = MainApplication.getPrimarystage();
        stage.setTitle("OPUS");
        stage.setScene(scene);
        stage.show();
    }

    public void onMonthlyTicketButtonClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/sdmproject/SelectMonthlyTicketType.fxml"));
        Scene scene= new Scene(fxmlLoader.load());
        Stage stage = MainApplication.getPrimarystage();

        stage.setTitle("Select Ticket Type");
        stage.setScene(scene);
        stage.show();
    }

    public void onWeeklyTicketButtonClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/sdmproject/SelectWeeklyTicketType.fxml"));
        Scene scene= new Scene(fxmlLoader.load());
        Stage stage = MainApplication.getPrimarystage();

        stage.setTitle("Select Ticket Type");
        stage.setScene(scene);
        stage.show();
    }

    public void onOneWayTicketButtonClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/sdmproject/SelectScreen.fxml"));
        Scene scene= new Scene(fxmlLoader.load());
        SelectScreenController selectScreenController = fxmlLoader.getController();
        selectScreenController.setAmount(3.5);
        Stage stage = MainApplication.getPrimarystage();

        stage.setTitle("Select Number of Tickets");
        stage.setScene(scene);
        stage.show();
    }

    public void onClickBackController(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/sdmproject/MainApplication.fxml"));
        Scene scene= new Scene(fxmlLoader.load());
        Stage stage = MainApplication.getPrimarystage();

        stage.setTitle("Payment");
        stage.setScene(scene);
        stage.show();
    }
}
