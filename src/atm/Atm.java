package atm;

//    2. Создать класс, описывающий банкомат.
//    Набор купюр, находящихся в банкомате, должен задаваться тремя свойствами:
//    количеством купюр номиналом 20, 50 и 100.
//    Сделать метод для добавления денег в банкомат.
//    Сделать функцию, снимающую деньги, которая принимает сумму денег,
//    а возвращает булевое значение - успешность выполнения операции.
//    При снятии денег функция должна распечатывать каким количеством
//    купюр какого номинала выдаётся сумма.
//    Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
public class Atm {
    int num20;
    int num50;
    int num100;

    public Atm(int num20, int num50, int num100) {
        this.num20 = num20;
        this.num50 = num50;
        this.num100 = num100;
    }

    void addMoney(int num20, int num50, int num100) {
        num20 += num20;
        num50 += num50;
        num100 += num100;
    }

    boolean removeMoney(int value) {
        int num100 = value / 100;
        int count100 = (num100 > this.num100) ? this.num100 : num100;
        value -= count100 * 100;

        int num50 = value / 50;
        int count50 = (num50 > this.num50) ? this.num50 : num50;
        value -= count50 * 50;

        int num20 = value / 20;
        int count20 = (num20 > this.num20) ? this.num20 : num20;
        value -= count20 * 20;

        if (value == 0) {
            System.out.println("Купюры номиналом 100: " + count100);
            System.out.println("Купюры номиналом 50: " + count50);
            System.out.println("Купюры номиналом 20: " + count20);
            return true;
        } else {
            return false;
        }


    }


}
