public class SupplyCrate {
    private String itemName;
    private String originRegion;
    private int baseValue;
    private boolean isContraband;

    public SupplyCrate(String itemName, String originRegion, int baseValue, boolean isContraband){
        this.itemName = itemName;
        this.originRegion = originRegion;
        this.baseValue = baseValue;
        this.isContraband = isContraband;
    }

    public String getItemName(){
        return itemName;
    }
    public void setItemName(String itemName){
        this.itemName = itemName;
    }

    public String getOriginRegion(){
        return originRegion;
    }
    public void setOriginRegion(String originRegion){
        this.originRegion = originRegion;
    }

    public int getBaseValue(){
        return baseValue;
    }
    public void setBaseValue(int baseValue){
        this.baseValue = baseValue;
    }

    public boolean isContraband(){
        return isContraband;
    }
    public void setContraband(boolean contraband){
        isContraband = contraband;
    }
}
