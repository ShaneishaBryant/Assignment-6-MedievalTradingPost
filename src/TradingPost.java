import java.util.ArrayList;

public class TradingPost {

    //encapsulate inventory arraylist within TradingPost class
    private ArrayList<SupplyCrate> inventory;

    public TradingPost(){
        this.inventory = new ArrayList<>();
    }

    //inventory methods
    public void addItem(SupplyCrate crate){
        inventory.add(crate);
    }

    public boolean removeItem(SupplyCrate crate){
        return inventory.remove(crate);
    }

    public int getInventorySize(){
        return inventory.size();
    }

    public int findItemIndex(SupplyCrate crate){
        return inventory.indexOf(crate);
    }

    public void printAllItems(){
        System.out.println("Trading Post Inventory | Total Items: " + inventory.size());
        for (SupplyCrate crate : inventory){
            System.out.println(crate);
        }
    }

    //add method for the loop
    public void printHighRiskItems(){
        System.out.println("===HIGH RISK ITEMS===");
        for(SupplyCrate crate : inventory){
            if(crate.isContraband() || crate.getBaseValue() > 1000){
                System.out.println("TAGGED: " + crate.getItemName() +
                        " | Value: " + crate.getBaseValue() +
                        " | Contraband Status: " + crate.isContraband());
            }
        }
    }

    //add is approved method
    public boolean isApproved(SupplyCrate crate){
        return inventory.contains(crate) && !crate.isReserved();
    }

}
