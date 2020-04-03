package com.mattgarrett.hangman

var playerLives = 0
var guessedList = mutableListOf<Char>()
var wordToGuess = ""

var playing = true
var winner = false







fun main() {
    greetUser()
}