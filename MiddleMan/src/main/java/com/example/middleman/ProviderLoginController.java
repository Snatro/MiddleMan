package com.example.middleman;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ProviderLoginController {
    @FXML
    private TextField username;
    @FXML
    private TextField password;

    @FXML
    private void onClickLogIn(){

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
