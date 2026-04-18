package quantity;


public class Length extends Quantity {
    public Length(){
        factor.put("Meter", 1.0);
        factor.put("Inch", 39.3701);
        factor.put("Feet", 3.28084);
        factor.put("Yard", 1.09361);
        factor.put("Mile", 0.000621371);
        factor.put("Nautical Mile", 0.000539957);
        factor.put("คืบ", 4.0);
        factor.put("ศอก", 2.0);
        factor.put("วา", 0.5);
        factor.put("เส้น", 0.025);
        factor.put("โยชน์", 0.0000625);

        for(String unitName : factor.keySet()){
            unit.add(unitName);
        }
    }

    @Override
    public String toString(){
        return "Length";
    }
}
