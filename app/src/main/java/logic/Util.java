package logic;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javafx.scene.control.ComboBox;
import quantity.Length;
import quantity.Quantity;

public class Util {
    private static Map<String, Quantity> quantityMap;
    private static final Length length = new Length();

    public static void initialize(){
        quantityMap = new HashMap<String, Quantity>();
        quantityMap.put("Length", length);
    }

    public static String[] getQuantities(){
        return quantityMap.keySet().toArray(String[]::new);
    }

    public ComboBox<String> getLengthDropDown(){
        return length.getUnit();
    }
}
