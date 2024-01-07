package creditcard;

public class Main {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard(30111247800004111L, 1000.25);
        CreditCard card2 = new CreditCard(30111247800004112L, 2000.25);
        CreditCard card3 = new CreditCard(30111247800004113L, 3000.25);

        System.out.println(card1.addAmount(100.05));
        System.out.println(card2.addAmount(200.25));
        System.out.println(card3.deleteAmount(300.05));
        card1.displayInfo();
        card2.displayInfo();
        card3.displayInfo();
    }
}
