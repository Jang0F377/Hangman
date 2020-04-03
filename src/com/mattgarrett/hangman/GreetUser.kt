package com.mattgarrett.hangman
private val c = Colors()

class UserGreetings() {

    fun greetUser() {
        var name: String
        do {
            print("Who is playing today?>> ")
            name = readLine()!!.trim()
        } while (name.isEmpty())

        var userName = name.capitalize()
        print(c.ANSI_RED + "Welcome to Kotlin-Hangman, $userName!" + c.ANSI_RESET)
        showRules()


    }

    private fun showRules() {
        println(
            c.ANSI_BLUE +
                    "\n=====HANGMAN==RULES=====" +
                    "\n===SELECT=A=DIFFICULTY===" +
                    "\n====GUESS=A=LETTER====" +
                    "\n==IF=ITS=WRONG=LOSE=A=LIFE" +
                    "\n==IF=ITS=RIGHT=ITLL=APPEAR==" +
                    "\n==GUESS=THE=WORD=BEFORE=YOUR.." +
                    "\n" +
                    "   _________\n" +
                    "  |         |\n" +
                    "  |         |\n" +
                    "  Q         |\n" +
                    "  I         |\n" +
                    "  |         |\n" +
                    " / \\        |\n" +
                    "            |\n" +
                    "--------------------" +
                    c.ANSI_RESET
        )


    }


    fun winnerMessage() {
        print(
            c.ANSI_PURPLE + "Congratulations!!\n" +
                    "YY   YY   OOOO    U    U\n" +
                    " YY YY   O    O   U    U\n" +
                    "  YYY    O    O   U    U\n" +
                    "  YYY    O    O   U    U\n" +
                    "  YYY     OOOO     UUUU\n\n" +
                    c.ANSI_YELLOW +
                    "W           W    OOOO    NNN    NNN\n" +
                    "W     W     W   O    O   NNNN   NNN\n" +
                    "WW   WWW   WW   O    O   NNN N  NNN\n" +
                    "WW  WWWWW  WW   O    O   NNN  NNNNN\n" +
                    "WWW WWWWW WWW   O    O   NNN   NNNN\n" +
                    "WWWWWWWWWWWWW    OOOO    NNN    NNN\n" +
                    c.ANSI_RESET
        )
    }

    fun loserMessage() {
        print(c.ANSI_RED+"SORRY")


    }
}