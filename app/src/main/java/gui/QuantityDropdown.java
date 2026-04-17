package gui;


import java.util.Arrays;

import javafx.scene.control.ComboBox;
import logic.Util;

public class QuantityDropdown extends ComboBox<String>{
    public QuantityDropdown(){
        String[] quantities = Util.getQuantityNames();
        Arrays.sort(quantities);
        for(String quantityName : quantities){
            getItems().add(quantityName);
        }
        
        setValue(quantities[0]);
        Util.setCurrentQuantity(quantities[0]);

        setOnAction(e -> {
            String quantity = getValue();
            Util.setCurrentQuantity(quantity);
        });
    }
}
