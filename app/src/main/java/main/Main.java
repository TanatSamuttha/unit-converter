package main;

import gui.FormPane;
import gui.QuantityDropdown;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{
    public void start(Stage primaryStage){
        VBox root = new VBox();
        root.setPadding(new Insets(10));
        FormPane formPane = new FormPane();
        QuantityDropdown quantityDropdown =  new QuantityDropdown(formPane);
        root.getChildren().addAll(quantityDropdown, formPane);
        Scene scene = new Scene(root, 422, 322);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Unit Converter");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}