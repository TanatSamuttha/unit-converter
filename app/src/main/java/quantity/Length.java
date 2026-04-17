package quantity;


public class Length extends Quantity {
    public Length(){
        factor.put("Meter", 1.0);
        factor.put("Inch", 39.3701);
        factor.put("Feet", 3.28084);
        for(String unitName : factor.keySet()){
            unit.add(unitName);
        }
    }

    @Override
    public String toString(){
        return "Length";
    }
}
