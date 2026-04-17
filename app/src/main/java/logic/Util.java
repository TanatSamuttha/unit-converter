package logic;

import java.util.HashMap;
import java.util.Map;

import quantity.Length;
import quantity.Quantity;

public class Util {
    private static Map<String, Quantity> quantityMap;

    public static void initialize(){
        quantityMap = new HashMap<String, Quantity>();
        quantityMap.put("Length", new Length());
    }
}
