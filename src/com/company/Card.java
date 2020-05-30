package com.company;

import java.util.UUID;

public abstract class Card {
    //create base private fields for card ID and privilege
    private UUID ID;
    private boolean Privilege;
    private boolean isActive;

    //base constructor
    public Card (boolean privilege){
        this.ID = UUID.randomUUID();
        this.Privilege = privilege;
        this.isActive = true;
    }

    //public privilege getter
    public boolean getPrivilege(){return Privilege;}

    //abstract for passing turnstile
    public abstract boolean Pass();

    //abstract for passing turnstile (for MoneyCard)
    public abstract boolean Pass(int i);

    //public void for banning card
    public void banCard(){
        this.isActive = false;
    }
}
