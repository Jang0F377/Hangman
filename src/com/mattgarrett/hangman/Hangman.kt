package com.mattgarrett.hangman

var playerLives = 0
var guessedList = mutableListOf<Char>()
var wordToGuess = ""
// initialize UserGrettings class for calling
val UG = UserGreetings()
// initialize Colors
private val c = Colors()
// Vars to show playing and winning
var playing = true
var winner = false

fun main() {
    UG.greetUser()
    chooseDifficulty()
}







fun takeAGuess() {
    var letter: Char
//  Loop until we have valid input
    do {
        print(c.ANSI_BLUE+"> "+c.ANSI_RESET)

//      Take User input in var
        val input = readLine()!!.toLowerCase()
        letter = when {
            input.length == 1 -> input.single()
            else -> '='
        }
    } while (!letter.isLetter())

    if (guessedList.contains(letter)) {
        print("[-]YOU HAVE ALREADY GUESSED THAT LETTER[-]")
        TODO()
    } else {
        guessedList.add(letter)

        if (!wordToGuess!!.contains(letter)) {
            playerLives--
        }
    }

    if (playerLives == 0) {
        playing = false
        winner = false
    }


}


// Method to either print an underscore for each letter in the word, that the user hasnt guessed
// Or fill in the letters that have been guessed
fun printWord() {
    wordToGuess = pickAWord()
    wordToGuess.forEach {
        c -> print(refactorWord(c)+" ")
    }
}

//Helper method to determine if the word contains guessed letters
fun refactorWord(c: Char): Char {
    return when (guessedList.contains(c)) {
        true -> c
        false -> '?'
    }
}


// Update function to check if the characters guessed match the word
fun checkGameOver(){
    var complete = true
    wordToGuess.forEach {
        c -> if (!guessedList.contains(c)) {
        complete = false
        }
    }

    if (complete) {
        playing = false
        winner = true
    }

}