package gui;

import javafx.scene.control.ComboBox;

public class QuantityDropdown extends ComboBox<String>{
    public QuantityDropdown(){
        getItems().addAll(
            "Length",
            "Volume",
            "Speed"
        );
        setValue("Length");

        setOnAction(e -> {
            String quantity = getValue();
        });
    }
}
