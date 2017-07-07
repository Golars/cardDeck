package com.golars.cardDeck.Exception;

public class CardSuitException extends CardDeckException
{

    public CardSuitException()
    {
        super("Please specify a valid value for card suit!");
    }
}
