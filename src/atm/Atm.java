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

    public void addMoney(int num20, int num50, int num100){
        num20 += num20;
        num50 += num50;
        num100 += num100;
    }
}
