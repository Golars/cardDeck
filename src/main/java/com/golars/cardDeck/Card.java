package com.golars.cardDeck;

import com.golars.cardDeck.Exception.CardDeckException;
import com.golars.cardDeck.Exception.CardSuitException;
import com.golars.cardDeck.Exception.CardValueException;

public class Card {

    public static final int SPADES = 0;
    public static final int CLUBS = 1;
    public static final int DIAMONDS = 2;
    public static final int HEARTS = 3;

    public static final int ACE = 1;
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;

    private final int value;
    private final int suit;

    /**
     * Initialize Card object
     *
     * @param value Integer value of card value (Ace=1, 2-10, Jack=11, Queen=12, King=13)
     * @param suit Integer value of card suit (SPADE=0, CLUB=1, DIAMOND=2, HEART=3)
     */
    public Card(int value, int suit) throws CardDeckException {
        if (suit != SPADES && suit != CLUBS && suit != HEARTS && suit != DIAMONDS) {
            throw new CardSuitException();
        }
        if (value < 1 || value > 13) {
            throw new CardValueException();
        }
        this.value = value;
        this.suit = suit;
    }

    /**
     * Returns the card value
     *
     * @return card value
     */
    public int getValue() {
        return value;
    }

    /**
     * Returns the card suit
     *
     * @return card suit
     */
    public int getSuit() {
        return suit;
    }

    /**
     * Returns the card suit as a String value.
     *
     * @return String value of card suit.
     */
    public String getSuitString() {
        switch (suit) {
            case SPADES:
                return "SPADES";
            case CLUBS:
                return "CLUBS";
            case DIAMONDS:
                return "DIAMONDS";
            default:
                return "HEARTS";
        }
    }

    /**
     * Returns the card value as a String value.
     *
     * @return String value of card value.
     */
    public String getValueString() {
        switch (value) {
            case 1:
                return "Ace";
            case 2:
                return "2";
            case 3:
                return "3";
            case 4:
                return "4";
            case 5:
                return "5";
            case 6:
                return "6";
            case 7:
                return "7";
            case 8:
                return "8";
            case 9:
                return "9";
            case 10:
                return "10";
            case 11:
                return "Jack";
            case 12:
                return "Queen";
            default:
                return "King";
        }
    }

    @Override
    public String toString() {
        return "{" + "value=" + value + ", suit=" + suit + '}';
    }
}