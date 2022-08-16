package com.example.middleman;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;


import java.io.IOException;

public class HelloController {

    @FXML
    protected void onCustomerButtonClick() {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("customer-login.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 600, 600);
        } catch (IOException e) {
            e.printStackTrace();
        }
        HelloApplication.getStage().setScene(scene);
        HelloApplication.getStage().setTitle("MiddleMan - Customer log in");
        HelloApplication.getStage().show();
    }
    @FXML
    private void onProviderButtonClick(){
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("provider-login.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 600, 600);
        } catch (IOException e) {
            e.printStackTrace();
        }
        HelloApplication.getStage().setScene(scene);
        HelloApplication.getStage().setTitle("MiddleMan - Provider log in");
        HelloApplication.getStage().show();
    }

    @FXML
    private void onRegisterCustomerButtonClick(){
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("customer-register-view.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 600, 500);
        } catch (IOException e) {
            e.printStackTrace();
        }
        HelloApplication.getStage().setScene(scene);
        HelloApplication.getStage().setTitle("MiddleMan - Customer registration");
        HelloApplication.getStage().show();
    }

    @FXML
    private void onRegisterProviderButtonClick(){
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("provider-register.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 600, 500);
        } catch (IOException e) {
            e.printStackTrace();
        }
        HelloApplication.getStage().setScene(scene);
        HelloApplication.getStage().setTitle("MiddleMan - Provider registration");
        HelloApplication.getStage().show();
    }
}