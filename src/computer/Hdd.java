package computer;

public class Hdd {
    String name;
    int capacity;
    String type;

    public Hdd() {
        this("hdd super", 16, "OUT type");
    }

    public Hdd(String name, int capacity, String type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }

    public void printInformation() {
        System.out.println("Название HDD: " + name + "\n Объем: " + capacity + " GB" + "\n Тип: " + type);
    }
}
