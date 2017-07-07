package com.golars.cardDeck;

import com.golars.cardDeck.Exception.CardDeckException;

import java.security.SecureRandom;
import java.util.ArrayList;


public class Deck
{
    protected ArrayList<Card> cardDeck;

    private static SecureRandom randomGenerator = new SecureRandom();

    public static final int COUNT_CARD = 52;


    public Deck()
    {
    }


    /**
     * Returns the number of cards remaining in a deck.
     *
     * @return Number of cards remaining in a deck.
     */
    public int remainingCards()
    {
        return cardDeck.size();
    }


    /**
     * Shuffles the deck
     */
    public void shuffle()
    {
        for (int i = cardDeck.size() - 1; i >= 0; i--) {
            int randomNumber = randomGenerator.nextInt(i + 1);
            Card lastCard = cardDeck.get(i);
            cardDeck.set(i, cardDeck.get(randomNumber));
            cardDeck.set(randomNumber, lastCard);
        }
    }


    /**
     * Deals a single card from the top of the deck.
     *
     * @return A card from the top of the deck.
     */
    public Card dealCard() throws CardDeckException
    {
        return this.getCard(0);
    }


    /**
     * Get card by index
     */
    public Card getCard(int index) throws CardDeckException
    {
        if (cardDeck.size() < index) {
            throw new CardDeckException("Index is invalid");
        }
        Card card = cardDeck.get(index);
        cardDeck.remove(index);
        return card;
    }


    /**
     * Add card to Deck
     */
    public void addCard(Card card)
    {
        cardDeck.add(card);
    }


    public boolean isCardsLeft()
    {
        return (cardDeck.size() > 0);
    }


    /**
     * Get cards in the deck.
     *
     * @return Card[]
     */
    public Card[] getCardDeck()
    {
        Card[] array = new Card[cardDeck.size()];
        return cardDeck.toArray(array);
    }

}
