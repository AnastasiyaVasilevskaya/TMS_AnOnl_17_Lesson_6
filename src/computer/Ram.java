package computer;

public class Ram {
    String name;
    int capacity;

    public Ram() {
    }

    public Ram(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;

    }

    public void printInformation() {
        System.out.println("Название RAM: " + name + "\n Объем: " + capacity + " GB");
    }
}
