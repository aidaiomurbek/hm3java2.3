package com.company;

public class BankAcount {
    private double amount;
    public double getAmount(){
        return amount;
    }
    public void deposit(double sum){
        amount += sum;
        System.out.println("вы положили: "+sum);
    }

    public void withDraw(int sum) throws LimitException {  //снимаем со счета 6000 сом
        if (sum>amount){
          throw new LimitException("у вас не хватает средств!",sum);
        }
        else {
            amount-=sum;
            System.out.println("операция прошла успешно!вы сняли со счета: "+sum);
            System.out.println("остаток на счете: "+amount);
        }

    }
}
