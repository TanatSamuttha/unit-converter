package main;

import gui.QuantityDropdown;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import logic.Util;

public class Main extends Application{
    public void start(Stage primaryStage){
        Util.initialize();
        VBox root = new VBox();
        root.setPadding(new Insets(10));
        QuantityDropdown quantityDropdown =  new QuantityDropdown();
        HBox form = new HBox();
        form.getChildren().addAll( Util.leftForm, Util.rightForm);
        root.getChildren().addAll(quantityDropdown, form);
        Scene scene = new Scene(root, 422, 322);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Unit Converter");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}