package com.golars.cardDeck.Exception;

public class CardValueException extends CardDeckException
{

    public CardValueException()
    {
        super("Please specify a valid value for card value!");
    }
}
