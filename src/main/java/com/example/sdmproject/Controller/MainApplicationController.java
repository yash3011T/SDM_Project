package com.example.sdmproject.Controller;


import com.example.sdmproject.Data;
import com.example.sdmproject.MainApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplicationController {
    String[] languageListItems = new String[]{"English","Française","Italiana"};
    public ComboBox<String> languageList ;




    public void initialize(){
        languageList.getItems().setAll(languageListItems);
        languageList.setValue(languageListItems[0]);
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

        if(languageList.getValue().equals("Française")){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Information");
            alert.setHeaderText("En cours de progression, bientôt disponible.");
            alert.showAndWait();
        }else if(languageList.getValue().equals("Italiana")){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Information");
            alert.setHeaderText("In corso, prossimamente");
            alert.showAndWait();
        }
    }

    public void OnTncClicled(MouseEvent mouseEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information");
        alert.setHeaderText("Term and Conditions");
        alert.setContentText("No person shall travel or attempt to travel on the transit system without paying the appropriate fare as provided in By-law A.33.3 r.3\n\n" +
                "All users of transit services operated by or on behalf of the STM must, in accordance with the applicable fare and in the manner required, pay their fare either with cash or with a transit fare recognized as valid by the STM. After paying their transit fare, the user must retrieve the fare medium and keep it with him or her as proof of payment for the purposes in By-law A.33.3 r.3\n\n" +
                "No person shall unlawfully use a transit fare or fare medium.\n\n"+"No person shall in any way delay the departure of the rolling stock or impede its movement, such as by preventing or delaying the closing of a door.\n\n" +
                "No person shall smoke, have lighted tobacco or another lighted substance in their possession.\n\n" +
                "No person shall use an electronic cigarette in such a manner that it emits vapour or smoke.\n\n" +
                "No unauthorized person shall consume alcohol or have an open alcoholic beverage in or on the premises or the rolling stock.\n\n" +
                "No person shall ride a bicycle, unicycle, tricycle or similar vehicle in a métro station or the rolling stock.");
        alert.showAndWait();
    }
}
