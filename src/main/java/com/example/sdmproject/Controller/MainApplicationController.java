package com.example.sdmproject.Controller;


import com.example.sdmproject.Data;
import com.example.sdmproject.MainApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplicationController {
    String[] languageListItems = new String[]{"English","French","Chinese","Hindi"};
    public ComboBox<String> languageList ;




    public void initialize(){
        languageList.getItems().setAll(languageListItems);
    }
    public void onClickBookTicket(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/sdmproject/Mainmenu.fxml"));
        Scene scene= new Scene(fxmlLoader.load());

        Stage stage = MainApplication.getPrimarystage();
        stage.setTitle("Main Menu");
        stage.setScene(scene);
        stage.show();
        Data data = Data.getInstance();
        data.setBalance(26.9);
    }

    public void onLanguageChange(ActionEvent actionEvent) {

        if(languageList.getValue().equals("French")){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Information");
            alert.setHeaderText("En cours de progression, bientôt disponible.");
            alert.showAndWait();
        }else if(languageList.getValue().equals("Hindi")){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Information");
            alert.setHeaderText("प्रगति के तहत, जल्द ही उपलब्ध होगा।");
            alert.showAndWait();
        }else if(languageList.getValue().equals("Chinese")){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Information");
            alert.setHeaderText("在进展中，很快就会推出");
            alert.showAndWait();
        }
    }
}
