package com.company;

public class Turnstile {
    public Turnstile(){};

    public boolean Pass(Card card, int currentPrice, CardCatalog cc){
        if (!cc.isInCatalog(card)){
            System.out.println("No such card!");
            return false;
        }
        else if (card instanceof TermCard || card instanceof TimesCard){
            return card.Pass();
        }
        else if (card instanceof MoneyCard){
            return card.Pass(currentPrice);
        }
        else {
            System.out.println("Wrong card type!");
            return false;
        }
    }
}
