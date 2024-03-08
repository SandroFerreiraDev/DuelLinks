package com.example.duellinks.gameMechanics

data class MonsterCard (
    val id: Int,
    val name: String,
    val attribute: CardAttribute,
    val level: CardLevel,
    val attack: Int,
    val defense: Int,
    val description: String,
    ) : Card(id,name,description) {

    fun getData(): MonsterCard {
        return MonsterCard(id, name, attribute, level, attack, defense, description)
    }
}

enum class CardAttribute {
    EARTH,
    WATER,
    FIRE,
    WIND,
    LIGHT,
    DARK
}

enum class CardLevel(val value: Int) {
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    ELEVEN(11),
    TWELVE(12);
}
