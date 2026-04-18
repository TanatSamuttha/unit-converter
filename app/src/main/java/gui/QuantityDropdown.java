package gui;


import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import javafx.scene.control.ComboBox;
import quantity.Length;
import quantity.Quantity;
import quantity.Weight;

public class QuantityDropdown extends ComboBox<String>{

    private static Map<String, Quantity> quantityMap = new LinkedHashMap<String, Quantity>();
    private static final Length length = new Length();
    private static final Weight weight = new Weight();
    private static Quantity currentQuantity;
    private FormPane formPane;

    public QuantityDropdown(FormPane formPane){
        this.formPane = formPane;
        quantityMap.put("Length", length);
        quantityMap.put("Weight", weight);

        String[] quantities = getQuantityNames();
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

    public void setCurrentQuantity(String name){
        currentQuantity = getQuantityObjects(name);
        formPane.update(currentQuantity.getUnit());
    }

    public static double getFactor(String unit){
        return currentQuantity.getFactor(unit);
    }
}
