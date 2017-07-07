package com.golars.cardDeck;

import org.junit.Test;

import static org.junit.Assert.*;


public class DeckTest
{
    @Test
    public void getCard() throws Exception
    {
        Deck deck = new StandardDeck(1);
        Card[] cards = deck.getCardDeck();

        Card firstCard = deck.getCard(0);
        assertEquals(cards[0].getValue(), firstCard.getValue());
        assertEquals(cards[0].getSuit(), firstCard.getSuit());
        assertEquals(deck.remainingCards(), Deck.COUNT_CARD - 1);
    }


    @Test
    public void shuffle() throws Exception
    {
        Deck deck = new StandardDeck();
        Card card = deck.dealCard();

        Deck deckShuffle = new StandardDeck();

        deckShuffle.shuffle();
        Card cardShuffle = deckShuffle.dealCard();
        if (cardShuffle.getSuit() == card.getSuit() && cardShuffle.getSuit() == card.getSuit()) {
            deckShuffle.shuffle();
        }

        assertNotEquals(card.toString(), cardShuffle.toString());
    }


    @Test
    public void remainingCards() throws Exception
    {
        Deck deck = new StandardDeck();
        assertEquals(deck.remainingCards(), Deck.COUNT_CARD);

        deck.dealCard();
        assertEquals(Deck.COUNT_CARD - 1, deck.remainingCards());

        deck.dealCard();
        assertEquals(Deck.COUNT_CARD - 2, deck.remainingCards());

        int allCards = Deck.COUNT_CARD * 3;
        deck = new StandardDeck(3);
        assertEquals(allCards, deck.remainingCards());

        deck.dealCard();
        assertEquals(allCards - 1, deck.remainingCards());

        deck.dealCard();
        assertEquals(allCards - 2, deck.remainingCards());
    }


    @Test
    public void isCardsLeft() throws Exception
    {
        Deck deck = new StandardDeck();
        assertEquals(deck.isCardsLeft(), true);
        deck.dealCard();
        assertEquals(deck.isCardsLeft(), true);
    }


    @Test
    public void getCardDeck() throws Exception
    {
        Deck deck = new StandardDeck();
        assertEquals(deck.getCardDeck().length, Deck.COUNT_CARD);
        deck.dealCard();
        assertEquals(deck.getCardDeck().length, Deck.COUNT_CARD - 1);
    }
}