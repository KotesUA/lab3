package com.company;

import java.time.LocalDate;

public class TermCard extends Card {
    //term may be
    private LocalDate endDate;

    public TermCard(boolean privilege, int term) {
        super(privilege);
        endDate = LocalDate.now().plusDays(term);
    }

    public LocalDate getEndDate(){return endDate;}

    @Override
    public boolean Pass() {
        if (LocalDate.now().isBefore(endDate)){
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
