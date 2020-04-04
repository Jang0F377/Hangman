package com.mattgarrett.hangman
private val c = Colors()

fun chooseDifficulty() {
    var userChoice: String

//    Loop until correct input is given
    do {
        print("\n__SELECT__DIFFICULTY__"+
        c.ANSI_GREEN+"\n1. EASY\n\t-10 LIVES"+c.ANSI_RESET+
        c.ANSI_YELLOW+"\n2. MEDIUM\n\t-8 LIVES"+c.ANSI_RESET+
        c.ANSI_RED+"\n3. HARD\n\t-6 LIVES"+c.ANSI_RESET)
        print(c.ANSI_CYAN+"\n__Please_Choose_a _Number__\n> "+c.ANSI_RESET)

        userChoice = readLine()!!.trim()
        if (userChoice == "1") {
            playerLives = 10
            break
        } else if (userChoice == "2") {
            playerLives = 8
            break
        } else if (userChoice == "3") {
            playerLives = 6
            break
        }
    } while (true)

}