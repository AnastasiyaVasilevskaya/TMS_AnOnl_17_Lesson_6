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
        int num20 = this.num20;
        int num50 = this.num50;
        int num100 = this.num100;

        if (removeMoneyRec(value)) {
            System.out.println("Выдано купюр номиналом 100: " + (num100 - this.num100));
            System.out.println("Выдано купюр номиналом 50: " + (num50 - this.num50));
            System.out.println("Выдано купюр номиналом 20: " + (num20 - this.num20));
            return true;
        } else {
            this.num20 = num20;
            this.num50 = num50;
            this.num100 = num100;
            return false;
        }
    }

    boolean removeMoneyRec(int value) {
        if (value == 0) {
            return true;
        }

        if (value >= 100 && num100 > 0) {
            num100--;
            if (removeMoneyRec(value - 100)) {
                return true;
            }
            num100++;
        }

        if (value >= 50 && num50 > 0) {
            num50--;
            if (removeMoneyRec(value - 50)) {
                return true;
            }
            num50++;
        }

        if (value >= 20 && num20 > 0) {
            num20--;
            if (removeMoneyRec(value - 20)) {
                return true;
            }
            num20++;
        }
        return false;

    }
}
