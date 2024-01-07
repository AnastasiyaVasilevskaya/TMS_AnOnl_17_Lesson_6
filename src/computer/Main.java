package computer;

public class Main {
    public static void main(String[] args) {
        Ram ram2 = new Ram("ram2000", 16);
        Hdd hdd2 = new Hdd("hdd4500", 48, "INtype");
        Computer computer1 = new Computer(15000, "TUF505DT");
        Computer computer2 = new Computer(30000, "TUF505DX", ram2, hdd2);

        computer1.printInformation();
        System.out.println();
        computer2.printInformation();
    }
}




















