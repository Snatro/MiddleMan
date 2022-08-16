package com.example.middleman;

import classes.Address;
import classes.Provider;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ProviderRegisterController {
    @FXML
    private TextField storeName;
    @FXML
    private TextField companyName;
    @FXML
    private TextField city;
    @FXML
    private TextField address;
    @FXML
    private TextField username;
    @FXML
    private TextField password;

    @FXML
    private void onClickRegister(){
        Provider newProvider = new Provider(username.getText(),password.getText());
        newProvider.setStoreName(storeName.getText());
        newProvider.setCorporateName(companyName.getText());
        Address addressStore = new Address(city.getText(),address.getText());
        newProvider.setAddress(addressStore);
    }

    @FXML
    private void onClickReturn(){
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 600, 600);
        } catch (IOException e) {
            e.printStackTrace();
        }
        HelloApplication.getStage().setScene(scene);
        HelloApplication.getStage().setTitle("MiddleMan");
        HelloApplication.getStage().show();

    }
}
