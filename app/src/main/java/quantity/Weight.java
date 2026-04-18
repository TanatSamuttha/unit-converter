package quantity;


public class Weight extends Quantity {
    public Weight(){
        factor.put("Kilogram", 1.0);
        factor.put("Ounce", 35.274);
        factor.put("Pound", 2.20462);
        factor.put("Long Ton", 0.000984207);
        factor.put("Short Ton", 0.00110231);
        factor.put("ขีด", 10.0);
        factor.put("ชั่ง", 0.8333);
        factor.put("หาบ", 0.01667);
        factor.put("บาท", 65.5996);
        factor.put("สลึง", 262.3983);

        for(String unitName : factor.keySet()){
            unit.add(unitName);
        }
    }

    @Override
    public String toString(){
        return "Length";
    }
}
