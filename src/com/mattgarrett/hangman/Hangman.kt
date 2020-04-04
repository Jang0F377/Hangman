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
//    Greet User
    UG.greetUser()
//    method to be called anywhere
    initializeGame()
//    game has finished
    println("Thank you for playing!")

}

fun initializeGame() {
    playing = true
    wordToGuess = ""
    playerLives = 0
    guessedList.clear()
    chooseDifficulty()
    playGame()

}



private fun playGame() {
    while (playing) {
        printWord()
        userInfo()

        takeAGuess()
        checkGameOver()
    }

    if (winner) {
        printWord()
        UG.winnerMessage()
    } else {
        UG.loserMessage()
    }

}


// Function to capture the users input and make sure it is valid
// And process the input through the word and guessed list
private fun takeAGuess() {
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
        playGame()
    } else {
        guessedList.add(letter)

        if (!wordToGuess.contains(letter)) {
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
private fun printWord() {
    wordToGuess = pickAWord()
    wordToGuess.forEach {
        c -> print(refactorWord(c)+" ")
    }
}

//Helper method to determine if the word contains guessed letters
private fun refactorWord(c: Char): Char {
    return when (guessedList.contains(c)) {
        true -> c
        false -> '?'
    }
}


// Update function to check if the characters guessed match the word
private fun checkGameOver(){
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