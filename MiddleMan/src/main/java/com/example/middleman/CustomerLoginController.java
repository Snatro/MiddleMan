package com.example.middleman;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CustomerLoginController {

    @FXML
    private TextField username;
    @FXML
    private PasswordField password;

    /**
     * logs in as customer
     */
    @FXML
    private void onClickLogIn(){

    }

    /**
     * return to main page
     */

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
