package com.example.sdmproject.Controller;

import com.example.sdmproject.MainApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class BlockOPUSController {

    public TextField mobileNumber;
    public TextField OTPField;


    public void onClickSendOTP(ActionEvent actionEvent) {
        if(mobileNumber.getText().length() !=10){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error!");
            alert.setHeaderText("Enter 10 digit mobile number.");
            alert.showAndWait();
            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success!");
        alert.setHeaderText("OTP has been sent successfully.");
        alert.showAndWait();
    }

    public void onClickBack(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/sdmproject/OpusHolderScreen.fxml"));
        Scene scene= new Scene(fxmlLoader.load());
        Stage stage = MainApplication.getPrimarystage();
        stage.setTitle("Main Screen");
        stage.setScene(scene);
        stage.show();
    }

    public void onClickSubmitOTP(ActionEvent actionEvent) throws IOException {
        if(mobileNumber.getText().length() !=10){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error!");
            alert.setHeaderText("Enter 10 digit mobile number.");
            alert.showAndWait();
            return;
        }
        if(OTPField.getText().equals("")){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Invalid OTP!");
            alert.setHeaderText("Please enter OTP.");
            alert.showAndWait();
            return;
        }
        if(!OTPField.getText().equals("0000")){
            OTPField.setText("");
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Invalid OTP!");
            alert.setHeaderText("You have entered wrong OTP. Please try again.");
            alert.showAndWait();
            return;
        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success!");
        alert.setHeaderText("Your card is blocked successfully. If you found your card again, contact the authority to unblock it.");
        alert.showAndWait();
        // Display Home screen
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/sdmproject/MainApplication.fxml"));
        Scene scene= new Scene(fxmlLoader.load());
        Stage stage = MainApplication.getPrimarystage();
        stage.setTitle("Main Screen");
        stage.setScene(scene);
        stage.show();
    }
}
