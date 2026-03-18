import java.util.HashMap;
import java.util.Map;

class RoomInventory {

    private Map<String, Integer> inventory;

    public RoomInventory() {
        inventory = new HashMap<>();
        inventory.put("Single Room", 5);
        inventory.put("Double Room", 3);
        inventory.put("Suite Room", 2);
    }

    public int getAvailability(String roomType) {
        return inventory.getOrDefault(roomType, 0);
    }

    public void updateAvailability(String roomType, int count) {
        inventory.put(roomType, count);
    }

    public void displayInventory() {
        for (String key : inventory.keySet()) {
            System.out.println(key + " Available: " + inventory.get(key));
        }
    }
}


public class UseCase3InventorySetup { public static void main(String[] args) {

    System.out.println("Welcome to Book My Stay");
    System.out.println("Hotel Booking System v3.0\n");

    RoomInventory inventory = new RoomInventory();

    System.out.println("Initial Inventory:");
    inventory.displayInventory();

    System.out.println("\nAfter Booking Update:");
    inventory.updateAvailability("Single Room", 4);
    inventory.displayInventory();
}
}
