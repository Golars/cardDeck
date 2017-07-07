package com.golars.cardDeck.Exception;

public class DeckEmptyException extends CardDeckException
{

    public DeckEmptyException()
    {
        super("Deck empty. No card are left in the deck.");
    }
}
