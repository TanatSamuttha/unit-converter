package gui;

import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class Form extends VBox {
    public ComboBox<String> unit = new ComboBox<String>();
    public TextField field = new TextField();

    public Form(){
        unit.getItems().add("test");
        getChildren().addAll(unit, field);
    }
}
