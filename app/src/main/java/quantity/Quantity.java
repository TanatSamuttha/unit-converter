package quantity;

import java.util.HashMap;
import java.util.Map;

import javafx.scene.control.ComboBox;

abstract public class Quantity {
    final protected Map<String, Double> factor = new HashMap<String,Double>();;
    final protected ComboBox<String> unit = new ComboBox<String>();;

    public double getFactor(String unit){
        return factor.get(unit);
    }

    public ComboBox<String> getUnit(){
        return unit;
    }
}
