package com.example.sdmproject.Controller;

import com.example.sdmproject.MainApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SelectWeeklyTicketTypeController {
    public void onClickBackController(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/sdmproject/MainMenu.fxml"));
        Scene scene= new Scene(fxmlLoader.load());

        Stage stage = MainApplication.getPrimarystage();
        stage.setTitle("Block My OPUS");
        stage.setScene(scene);
        stage.show();
    }

    public void onClickTripsinZoneA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/sdmproject/SelectScreen.fxml"));
        Scene scene= new Scene(fxmlLoader.load());
        SelectScreenController selectScreenController = fxmlLoader.getController();
        selectScreenController.setAmount(17.0);
        Stage stage = MainApplication.getPrimarystage();

        stage.setTitle("Select Number of Tickets");
        stage.setScene(scene);
        stage.show();
    }

    public void onClickTripsinZoneAB(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/sdmproject/SelectScreen.fxml"));
        Scene scene= new Scene(fxmlLoader.load());
        SelectScreenController selectScreenController = fxmlLoader.getController();
        selectScreenController.setAmount(20.0);
        Stage stage = MainApplication.getPrimarystage();

        stage.setTitle("Select Number of Tickets");
        stage.setScene(scene);
        stage.show();
    }

    public void onClickTripsinZoneAC(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/sdmproject/SelectScreen.fxml"));
        Scene scene= new Scene(fxmlLoader.load());
        SelectScreenController selectScreenController = fxmlLoader.getController();
        selectScreenController.setAmount(21.0);
        Stage stage = MainApplication.getPrimarystage();

        stage.setTitle("Select Number of Tickets");
        stage.setScene(scene);
        stage.show();
    }

    public void onClickTripsinZoneABC(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/sdmproject/SelectScreen.fxml"));
        Scene scene= new Scene(fxmlLoader.load());
        SelectScreenController selectScreenController = fxmlLoader.getController();
        selectScreenController.setAmount(23.0);
        Stage stage = MainApplication.getPrimarystage();

        stage.setTitle("Select Number of Tickets");
        stage.setScene(scene);
        stage.show();
    }
}
