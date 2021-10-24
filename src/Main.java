public class Main {
    public static void main(String[] args) {
        int moneyAccount = 100;  //остаток на счету
        int depositAmount = 1_000; //сумма пополнения
        int bonus;  //бонус

        if (depositAmount < 1000) {
            bonus = 0;
        } else {
            bonus = depositAmount / 100;
        }

        //итоговая сумма
        int itogAccount = moneyAccount + depositAmount + bonus;

        System.out.println(itogAccount);
    }
}