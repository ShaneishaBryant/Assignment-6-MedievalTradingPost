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
}
