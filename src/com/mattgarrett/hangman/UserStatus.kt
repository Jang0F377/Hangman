package com.mattgarrett.hangman

private val c = Colors()

fun userInfo() {
    when {
        playerLives <= 3 -> print(c.ANSI_RED)
        playerLives <= 6 -> print(c.ANSI_YELLOW)
        else -> print(c.ANSI_GREEN)

    }
    println("LIVES: $playerLives"+c.ANSI_RESET)
    print("GUESSED: ")
    guessedList.forEach {
        c -> print(c+" ")
    }
    println()

}