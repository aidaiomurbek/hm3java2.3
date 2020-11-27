package com.company;

public class Main {

    public static void main(String[] args) throws LimitException {
        BankAcount bank = new BankAcount();   //экземпляр нового счета
        bank.deposit(20000);      //в этом методе мы ложим деньги на счет
        while (true){              //это у нас создается бесконечный цикл
            try {
                bank.withDraw(6000);   //здесь возможно будет ограбление
            } catch (LimitException e) {
                e.printStackTrace();   //это следователь который говорит где кого ловить
                bank.withDraw((int) bank.getAmount());
                break;
            }
        }
    }
}
