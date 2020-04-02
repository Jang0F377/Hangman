package com.mattgarrett.hangman

import kotlin.system.exitProcess

private class GameInput(arg: String?) {
    private val input = arg.toString()



    fun processCommand(): Any = when (input.toLowerCase()) {


        "exit" -> leaveGame()
        else -> commandNotFound()
    }

    private fun commandNotFound() = "Im not quite sure what your trying to do please chose a letter!"
    private fun leaveGame() {
        println("Thank you for playing!")
        exitProcess(0)
    }
}