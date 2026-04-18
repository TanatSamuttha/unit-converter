package gui;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javafx.scene.control.ComboBox;
import quantity.Length;
import quantity.Quantity;

public class QuantityDropdown extends ComboBox<String>{

    private static Map<String, Quantity> quantityMap = new HashMap<String, Quantity>();
    private static final Length length = new Length();
    private static Quantity currentQuantity;
    private static FormPane formPane;

    public QuantityDropdown(FormPane formPane){
        this.formPane = formPane;
        quantityMap.put("Length", length);

        String[] quantities = getQuantityNames();
        Arrays.sort(quantities);
        for(String quantityName : quantities){
            getItems().add(quantityName);
        }
        
        setValue(quantities[0]);
        setCurrentQuantity(quantities[0]);

        setOnAction(e -> {
            String quantity = getValue();
            setCurrentQuantity(quantity);
        });
    }

    public static String[] getQuantityNames(){
        return quantityMap.keySet().toArray(String[]::new);
    }

    public static Quantity getQuantityObjects(String name){
        return quantityMap.get(name);
    }

    public static void setCurrentQuantity(String name){
        currentQuantity = getQuantityObjects(name);
        formPane.update(currentQuantity.getUnit());
    }
}
