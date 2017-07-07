package com.golars.cardDeck;

import org.junit.Test;

import static org.junit.Assert.*;


public class CardTest
{

    @Test
    public void getValue() throws Exception
    {
        Card card = new Card(Card.ACE, Card.SPADES);
        assertEquals(card.getValue(), Card.ACE);

        Card cardNew = new Card(Card.QUEEN, Card.HEARTS);
        assertEquals(cardNew.getValue(), Card.QUEEN);
    }


    @Test
    public void getSuit() throws Exception
    {
        Card card = new Card(Card.ACE, Card.SPADES);
        assertEquals(card.getSuit(), Card.SPADES);

        Card cardNew = new Card(Card.QUEEN, Card.HEARTS);
        assertEquals(cardNew.getSuit(), Card.HEARTS);
    }


    @Test
    public void getSuitString() throws Exception
    {
        Card card = new Card(Card.ACE, Card.SPADES);
        assertEquals(card.getSuitString(), "SPADES");

        Card cardNew = new Card(Card.QUEEN, Card.HEARTS);
        assertEquals(cardNew.getSuitString(), "HEARTS");
    }


    @Test
    public void getValueString() throws Exception
    {
        Card card = new Card(Card.ACE, Card.SPADES);
        assertEquals(card.getValueString(), "Ace");

        Card cardNew = new Card(Card.QUEEN, Card.HEARTS);
        assertEquals(cardNew.getValueString(), "Queen");
    }

}