package com.ums;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.application.Application.launch;
import static javafx.fxml.FXMLLoader.load;

public class UMSApplication extends Application {
    private Stage primaryStage;

    private AnchorPane userUI;
    private BorderPane mainUI;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("User Management System");
        initRootLayout();
        showUserUI();
    }
    // Initializes the root layout.
    public void initRootLayout() {

        //mainUI = (BorderPane) FXMLLoader.load(getClass().getResource("ui/MainUI.fxml"));
        try {
            mainUI = (BorderPane)FXMLLoader.load(getClass().getResource("./ui/MainUI.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Scene scene = new Scene(mainUI);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    // Shows the user UI inside the root layout.
    public void showUserUI() {
        try {
// Load userUI
            userUI = (AnchorPane) load(getClass().getResource("ui/UserUI.fxml"));
// Set userUI into the center of root layout.
            mainUI.setCenter(userUI);
        } catch (IOException e) { e.printStackTrace(); }
    }
    // Returns the main stage.
    public Stage getPrimaryStage() {
        return primaryStage;
    }
    public static void main(String[] args) {
        launch(args);
    }
}