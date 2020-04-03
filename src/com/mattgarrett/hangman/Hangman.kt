package com.mattgarrett.hangman

var playerLives = 0
var guessedList = mutableListOf<Char>()
var wordToGuess = ""
// initialize UserGrettings class for calling
val UG = UserGreetings()
// Vars to show playing and winning
var playing = true
var winner = false







fun main() {
    UG.greetUser()
    chooseDifficulty()
}



fun printWord() {
    wordToGuess = pickAWord()
    wordToGuess.forEach {
        c -> print(refactorWord(c)+" ")
    }
}

fun refactorWord(c: Char): Char {
    return when (guessedList.contains(c)) {
        true -> c
        false -> '?'
    }
}