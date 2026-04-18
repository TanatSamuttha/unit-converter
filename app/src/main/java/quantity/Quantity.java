package quantity;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

abstract public class Quantity {
    final protected Map<String, Double> factor = new LinkedHashMap<String, Double>();
    final protected ArrayList<String> unit = new ArrayList<String>();

    public double getFactor(String unit){
        return factor.get(unit);
    }

    public ArrayList<String> getUnit(){
        return unit;
    }

    abstract public String toString();
}
