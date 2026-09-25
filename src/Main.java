import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //instantiate the Trading Post
        TradingPost post = new TradingPost();

        SupplyCrate crate1 = new SupplyCrate("Dragon Egg", "Volcanic Mountain", 2500, true, true);
        SupplyCrate crate2 = new SupplyCrate("Silk", "Northern Highlands", 500, false, false);
        SupplyCrate crate3 = new SupplyCrate("Iron Ore", "Eastern Isles", 150, false, false);
        SupplyCrate crate4 = new SupplyCrate("Black Powder", "Shadow Cove", 800, false, false);
        SupplyCrate crate5 = new SupplyCrate("Flax Seeds", "Sand Island", 3000, true, false);

        post.addItem(crate1);
        post.addItem(crate2);
        post.addItem(crate3);
        post.addItem(crate4);
        post.addItem(crate5);

        post.removeItem(crate4);
        post.printHighRiskItems();

        System.out.println();
        boolean crate1Approved = post.isApproved(crate1);
        System.out.println("Dragon Egg Approval Status: " + crate1Approved);

        boolean crate2Approved = post.isApproved(crate2);
        System.out.println("Silk Approval Status: " + crate2Approved);

        boolean crate3Approved = post.isApproved(crate3);
        System.out.println("Iron Ore Approval Status: " + crate3Approved);

        /*System.out.println("Total items in inventory: " + inventory.size());//

        int position = inventory.indexOf(crate2);
       System.out.println("The 'Silk' is located at crate: " + position);


        System.out.println("Item removed. New inventory size: " + inventory.size());
        System.out.println();


        System.out.println("===HIGH RISK ITEMS===");
        for(SupplyCrate crate : inventory){
            if(crate.isContraband() || crate.getBaseValue() > 1000){
                System.out.println("TAGGED: " + crate.getItemName() + " | Value: " + crate.getBaseValue() + " | Contraband Status: " + crate.isContraband());
            }
        }*/

    }
}
