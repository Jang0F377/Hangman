package com.mattgarrett.hangman
private val c = Colors()

fun greetUser() {
    var name: String
    do {
        print("Who is playing today?>> ")
        name = readLine()!!.trim()
    } while (name.isEmpty())

    var userName = name.capitalize()
    print(c.ANSI_RED+"Welcome to Kotlin-Hangman, $userName!"+c.ANSI_RESET)
    showRules()


}

private fun showRules() {
    println(c.ANSI_BLUE +
    "\n=====HANGMAN==RULES====="+
    "\n===SELECT=A=DIFFICULTY==="+
    "\n====GUESS=A=LETTER===="+
    "\n==IF=ITS=WRONG=LOSE=A=LIFE"+
    "\n==IF=ITS=RIGHT=ITLL=APPEAR=="+
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
            c.ANSI_RESET)



}