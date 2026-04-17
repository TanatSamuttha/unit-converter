package main;

import gui.QuantityDropdown;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application{
    public void start(Stage primaryStage){
        HBox root = new HBox();
        root.setPadding(new Insets(10));
        root.getChildren().add(new QuantityDropdown());
        Scene scene = new Scene(root, 422, 322);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Unit Converter");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}