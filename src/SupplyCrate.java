public class SupplyCrate {
    private String itemName;
    private String originRegion;
    private int baseValue;
    private boolean isContraband;
    private boolean isReserved;

    public SupplyCrate(String itemName, String originRegion, int baseValue, boolean isContraband, boolean isReserved){
        this.itemName = itemName;
        this.originRegion = originRegion;
        this.baseValue = baseValue;
        this.isContraband = isContraband;
        this.isReserved = isReserved;
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

    public boolean isReserved(){return isReserved;}
    public void setReserved(boolean reserved){ isReserved = reserved;}
}
