public class Main {
    public static void main(String[] args) {
        int money_account = 100;  //остаток на счету
        int deposit_amount = 1_000; //сумма пополнения
        int bonus;  //бонус

        if (deposit_amount < 1100) {
            bonus = 0;
        } else {
            bonus = (deposit_amount / 100) - 10;
        }

        //итоговая сумма
        int itog_account = money_account + deposit_amount + bonus;

        System.out.println(itog_account);
    }
}