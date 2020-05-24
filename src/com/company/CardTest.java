package com.company;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {
    static int currentPrice = 5;

    @Test
    void testAll(){
        CardCatalog cc = new CardCatalog(currentPrice);

        MoneyCard mc = new MoneyCard(false, 10);
        MoneyCard mcp = new MoneyCard(true, 10);
        TimesCard tc = new TimesCard(false, 2);
        TermCard trc = new TermCard(false, 3);

        Turnstile turnstile = new Turnstile();

        assertFalse(turnstile.Pass(mc, currentPrice, cc));

        cc.addCard(mc);

        assertTrue(turnstile.Pass(mc, currentPrice, cc));
    }
}