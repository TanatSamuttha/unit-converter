package logic;

import java.util.HashMap;
import java.util.Map;

import gui.Form;
import quantity.Length;
import quantity.Quantity;

public class Util {
    private static Map<String, Quantity> quantityMap;
    private static final Length length = new Length();
    private static Quantity currentQuantity;
    public static Form leftForm = new Form();
    public static Form rightForm = new Form();

    public static void initialize(){
        quantityMap = new HashMap<String, Quantity>();
        quantityMap.put("Length", length);
    }

    public static String[] getQuantityNames(){
        return quantityMap.keySet().toArray(String[]::new);
    }

    public static Quantity getQuantityObjects(String name){
        return quantityMap.get(name);
    }

    public static void setCurrentQuantity(String name){
        currentQuantity = getQuantityObjects(name);
        leftForm.unit.getItems().clear();
        leftForm.unit.getItems().addAll(currentQuantity.getUnit());
        rightForm.unit.getItems().clear();
        rightForm.unit.getItems().addAll(currentQuantity.getUnit());
    }
}
