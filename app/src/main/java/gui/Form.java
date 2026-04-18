package gui;

import java.util.ArrayList;

import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class Form extends VBox {
    public ComboBox<String> unit = new ComboBox<String>();
    public TextField field = new TextField();

    public Form(){
        getChildren().addAll(unit, field);
    }

    public void update(ArrayList<String> unit){
        this.unit.getItems().clear();
        this.unit.getItems().addAll(unit);
        this.unit.setValue(unit.get(0));
    }

    public String getCurrentUnit(){
        return unit.getValue();
    }
}
