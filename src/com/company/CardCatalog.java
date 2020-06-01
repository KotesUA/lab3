package com.company;

import java.util.ArrayList;

public class CardCatalog {
    private ArrayList<Card> Cards;
    private int fullPrice;

    public CardCatalog(int price){
        this.Cards = new ArrayList<Card>();
        this.fullPrice = price;
    }

    public boolean addCard(Card card){
        if (!isInCatalog(card)){
            Cards.add(card);
            return true;
        }
        else return false;
    }

    public void setFullPrice(int newPrice){this.fullPrice = newPrice;}

    public boolean isInCatalog(Card card){
        for (Card c:Cards
             ) {
            if (c.equals(card)){
                return true;
            }
        }
        return false;
    }
}
