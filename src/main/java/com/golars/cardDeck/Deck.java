package com.golars.cardDeck;

import com.golars.cardDeck.Exception.CardDeckException;
import com.golars.cardDeck.Exception.DeckEmptyException;

import java.security.SecureRandom;

public class Deck {
    private Card[] cardDeck;
    private static SecureRandom randomGenerator = new SecureRandom();
    private int cardUsed = 0;
    public static final int COUNT_CARD = 52;

    /**
     * Initializes a single deck of cards.
     */
    public Deck() throws CardDeckException {
        this(1);
    }

    /**
     * Initializes a specified number of decks.
     */
    public Deck(int numDeck) throws CardDeckException {
        cardDeck = new Card[numDeck * COUNT_CARD];
        int cardCount = 0;
        // Number of decks to initialize.
        for (int i = 0; i < numDeck; i++) {
            // Assign cards suits 0, 1, 2, 3 to deck
            for (int cardSuit = Card.SPADES; cardSuit <= Card.HEARTS; cardSuit++) {
                //Assign card values Ace to King to deck
                for (int cardValue = Card.ACE; cardValue <= Card.KING; cardValue++) {
                    Card card = new Card(cardValue, cardSuit);
                    cardDeck[cardCount] = card;
                    cardCount++;
                }
            }
        }
    }

    /**
     * Shuffles the deck
     */
    public void shuffle() {
        for (int i = cardDeck.length-1; i >= 0; i--) {
            int randomNumber = randomGenerator.nextInt(i + 1);
            Card lastCard = cardDeck[i];
            cardDeck[i] = cardDeck[randomNumber];
            cardDeck[randomNumber] = lastCard;
        }
    }

    /**
     * Returns the number of cards remaining in a deck.
     * @return Number of cards remaining in a deck.
     */
    public int remainingCards() {
        return cardDeck.length - cardUsed;
    }

    /**
     * Deals a single card from the top of the deck.
     * @return A card from the top of the deck.
     */
    public Card dealCard() throws CardDeckException {
        if (!isCardsLeft()) {
            throw new DeckEmptyException();
        }
        Card card = cardDeck[cardUsed];
        cardUsed++;
        return card;
    }

    public boolean isCardsLeft() {
        return (cardUsed < cardDeck.length);
    }

    /**
     * Get cards in the deck.
     * @return Card[]
     */
    public Card[] getCardDeck() {
        return cardDeck;
    }

}
