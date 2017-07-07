package com.golars.cardDeck;

import com.golars.cardDeck.Exception.CardDeckException;

import java.util.ArrayList;


public class StandardDeck extends Deck
{
    public static final int COUNT_CARD = 52;


    /**
     * Initializes a single deck of cards.
     */
    public StandardDeck() throws CardDeckException
    {
        this(1);
    }


    /**
     * Initializes a specified number of decks.
     */
    public StandardDeck(int numDeck) throws CardDeckException
    {
        cardDeck = new ArrayList<Card>(numDeck * COUNT_CARD);
        // Number of decks to initialize.
        for (int i = 0; i < numDeck; i++) {
            // Assign cards suits 0, 1, 2, 3 to deck
            for (int cardSuit = Card.SPADES; cardSuit <= Card.HEARTS; cardSuit++) {
                //Assign card values Ace to King to deck
                for (int cardValue = Card.ACE; cardValue <= Card.KING; cardValue++) {
                    Card card = new Card(cardValue, cardSuit);
                    cardDeck.add(card);
                }
            }
        }
    }

}
