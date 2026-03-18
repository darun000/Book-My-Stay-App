abstract class Room {

    protected String type;
    protected int beds;
    protected double price;

    public Room(String type, int beds, double price) {
        this.type = type;
        this.beds = beds;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Room Type: " + type);
        System.out.println("Beds: " + beds);
        System.out.println("Price: " + price);
    }
}

class SingleRoom extends Room {

    public SingleRoom() {
        super("Single Room", 1, 1000);
    }
}

class DoubleRoom extends Room {

    public DoubleRoom() {
        super("Double Room", 2, 2000);
    }
}

class SuiteRoom extends Room {

    public SuiteRoom() {
        super("Suite Room", 3, 5000);
    }
}


public class UseCase2RoomInitialization { public static void main(String[] args) {

    System.out.println("Welcome to Book My Stay");
    System.out.println("Hotel Booking System v2.0\n");

    Room single = new SingleRoom();
    Room doubleRoom = new DoubleRoom();
    Room suite = new SuiteRoom();

    int singleAvailable = 5;
    int doubleAvailable = 3;
    int suiteAvailable = 2;

    System.out.println("Single Room Details:");
    single.displayDetails();
    System.out.println("Available: " + singleAvailable + "\n");

    System.out.println("Double Room Details:");
    doubleRoom.displayDetails();
    System.out.println("Available: " + doubleAvailable + "\n");

    System.out.println("Suite Room Details:");
    suite.displayDetails();
    System.out.println("Available: " + suiteAvailable);
}
}
