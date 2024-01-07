package CreditCard;
//0. Создать класс CreditCard.CreditCard с полями номер счета, текущая сумма на счету.
//    Добавьте метод, который позволяет начислять сумму на кредитную карточку.
//    Добавьте метод, который позволяет снимать с карточки некоторую сумму.
//    Добавьте метод, который выводит текущую информацию о карточке.
//    Напишите программу, которая создает три объекта класса CreditCard y
//    которых заданы номер счета и начальная сумма

public class CreditCard {
    long accountNumber;
    double currentAmount;

    public CreditCard(long accountNumber, double currentAmount) {
        this.accountNumber = accountNumber;
        this.currentAmount = currentAmount;
    }

    public double addAmount(double charge) {
        currentAmount += charge;
        return currentAmount;
    }

    public double deleteAmount(double withdrawal) {
        currentAmount -= withdrawal;
        return currentAmount;
    }

    public void displayInfo() {
        System.out.println("Номер счета: " + accountNumber + ", текущая сумма на счету: " + currentAmount);
    }


}
