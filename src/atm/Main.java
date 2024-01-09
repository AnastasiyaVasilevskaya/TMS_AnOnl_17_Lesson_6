package atm;

public class Main {
    public static void main(String[] args) {
        Atm atm = new Atm (0, 0, 2);
        System.out.println(atm.removeMoney(20));
    }
}
