package com.company;

public class Main {

    public static void main(String[] args) {
        int currentPrice = 5;
        CardCatalog cc = new CardCatalog(currentPrice);

        MoneyCard mc = new MoneyCard(false, 10);
        MoneyCard mcp = new MoneyCard(true, 10);
        TimesCard tc = new TimesCard(false, 2);
        TermCard trc = new TermCard(false, 3);

        Turnstile turnstile = new Turnstile();

        turnstile.Pass(mc, currentPrice, cc);   //must not work

        cc.addCard(mc);

        turnstile.Pass(mc, currentPrice, cc);   //works
    }
}
