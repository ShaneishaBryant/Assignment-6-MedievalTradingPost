import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<SupplyCrate> inventory = new ArrayList<>();

        SupplyCrate crate1 = new SupplyCrate("Dragon Egg", "Volcanic Mountain", 2500, true);
        SupplyCrate crate2 = new SupplyCrate("Silk", "Northern Highlands", 500, false);
        SupplyCrate crate3 = new SupplyCrate("Iron Ore", "Eastern Isles", 150, false);
        SupplyCrate crate4 = new SupplyCrate("Black Powder", "Shadow Cove", 800, false);
        SupplyCrate crate5 = new SupplyCrate("Flex Seeds", "Sand Island", 3000, true);

        inventory.add(crate1);
        inventory.add(crate2);
        inventory.add(crate3);
        inventory.add(crate4);
        inventory.add(crate5);


        System.out.println("Total items in inventory: " + inventory.size());

        int position = inventory.indexOf(crate2);
        System.out.println("The 'Silk' is located at crate: " + position);

        inventory.remove(crate2);
        System.out.println("Item removed. New inventory size: " + inventory.size());
        System.out.println();

        System.out.println("===HIGH RISK ITEMS===");
        for(SupplyCrate crate : inventory){
            if(crate.isContraband() || crate.getBaseValue() > 1000){
                System.out.println("TAGGED: " + crate.getItemName() + " | Value: " + crate.getBaseValue() + " | Contraband Status: " + crate.isContraband());
            }
        }

    }
}
