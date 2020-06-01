package com.company;

public class MoneyCard extends Card{
    private double Balance;
    private int currentFullPrice;

    public MoneyCard(boolean privilege, int balance) {
        super(privilege);
        this.Balance = balance;
    }

    public double getBalance() {return Balance;}

    @Override
    public boolean Pass() {
        return false;
    }

    @Override
    public boolean Pass(int currentFullPrice) {
        if (!super.getPrivilege() && currentFullPrice < Balance){
            Balance -= currentFullPrice;
            System.out.println("Here you go!");
            return true;
        }
        else if (super.getPrivilege() && currentFullPrice/2 < Balance){
            Balance -= currentFullPrice/2;
            System.out.println("Here you go!");
            return true;
        }
        else return false;
    }

    public void depositMoney(double sum){
        Balance += sum;
    }
}
