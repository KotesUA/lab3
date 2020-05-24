package com.company;

public class TimesCard extends Card{
    private int Times;

    public TimesCard(boolean privilege, int times) {
        super(privilege);
        this.Times = times;
    }

    public int getTimes(){return Times;}

    @Override
    public boolean Pass() {
        if (Times > 0) {
            Times--;
            System.out.println("Here you go!");
            return true;
        }
        else return false;
    }

    @Override
    public boolean Pass(int i) {
        return false;
    }
}
