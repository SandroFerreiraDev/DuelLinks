package com.example.duellinks.gameMechanics

class Deck {
    private val cards: MutableList<Card> = mutableListOf()

    fun addCard(card: Card) {
        cards.add(card)
    }

    fun removeCard(card: Card) {
        cards.remove(card)
    }

    fun clear() {
        cards.clear()
    }

    fun size(): Int {
        return cards.size
    }

}