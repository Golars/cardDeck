package com.golars.cardDeck;

import com.golars.cardDeck.Exception.CardDeckException;

public class App 
{
    /**
     * Create a deck of cards, shuffle the deck, then deal out all the cards.
     *
     * @param args
     */
    public static void main(String[] args) {
        try {
            Deck deck = new Deck(1);
            deck.shuffle();
            int count = deck.remainingCards();
            for (int i=0; i < count; i++) {
                Card card = deck.dealCard();
                System.out.println("Dealt Card " + deck.remainingCards() + ": " + card.getValueString() + " of " + card.getSuitString());
            }
        } catch (CardDeckException e) {
            e.printStackTrace();
        }
    }
}
