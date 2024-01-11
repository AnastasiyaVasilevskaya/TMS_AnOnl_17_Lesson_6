package computer;

public class Ram {
    String name;
    int capacity;

    public Ram() {
        this("ram param", 32);
    }

    public Ram(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void printInformation() {
        System.out.println("Название RAM: " + name + "\n Объем: " + capacity + " GB");
    }
}
