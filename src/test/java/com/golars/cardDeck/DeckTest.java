package com.golars.cardDeck;

import org.junit.Test;

import static org.junit.Assert.*;

public class DeckTest {
    @Test
    public void shuffle() throws Exception {
        Deck deck = new Deck(1);
        Card card = deck.dealCard();

        Deck deckShuffle = new Deck(1);

        deckShuffle.shuffle();
        Card cardShuffle = deckShuffle.dealCard();
        if(cardShuffle.getSuit() == card.getSuit() && cardShuffle.getSuit() == card.getSuit()) {
            deckShuffle.shuffle();
        }

        assertNotEquals(card.toString(), cardShuffle.toString());
    }

    @Test
    public void remainingCards() throws Exception {
        Deck deck = new Deck(1);
        assertEquals(deck.remainingCards(), Deck.COUNT_CARD);

        deck.dealCard();
        assertEquals(deck.remainingCards(), Deck.COUNT_CARD - 1);

        deck.dealCard();
        assertEquals(deck.remainingCards(), Deck.COUNT_CARD - 2);

        int allCards = Deck.COUNT_CARD * 3;
        deck = new Deck(3);
        assertEquals(deck.remainingCards(), allCards);

        deck.dealCard();
        assertEquals(deck.remainingCards(), allCards - 1);

        deck.dealCard();
        assertEquals(deck.remainingCards(), allCards - 2);
    }

    @Test
    public void isCardsLeft() throws Exception {
        Deck deck = new Deck(1);
        assertEquals(deck.isCardsLeft(), true);
        deck.dealCard();
        assertEquals(deck.isCardsLeft(), true);
    }

    @Test
    public void getCardDeck() throws Exception {
        Deck deck = new Deck(1);
        assertEquals(deck.getCardDeck().length, Deck.COUNT_CARD);
        deck.dealCard();
        assertEquals(deck.getCardDeck().length, Deck.COUNT_CARD);
    }
}