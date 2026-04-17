package quantity;

import java.util.Map;

import javafx.scene.control.ComboBox;

abstract public class Quantity {
    final private Map<String, Double> factor;
    final private ComboBox<String> unit;

    public Quantity(Map<String, Double> factor, ComboBox<String> unit){
        this.factor = factor;
        this.unit = unit;
    }
}
