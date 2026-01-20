package Day10_Assignment_has_a;

class Room {
    String type;

    Room(String type) {
        this.type = type;
    }
}

class House {
    private Room room;

    House() {
        room = new Room("Bedroom");
    }

    void show() {
        System.out.println("House has a " + room.type);
    }
}

public class TestComposition1 {
    public static void main(String[] args) {
        House h = new House();
        h.show();
    }
}

