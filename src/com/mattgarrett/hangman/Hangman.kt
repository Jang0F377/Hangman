package com.mattgarrett.hangman

import java.io.File

const val lives: Int = 5
val selectedWord by lazy { selectWord() }

// File to select a word from
fun selectWord() = File("data/Words.txt")
    .readLines()
    .shuffled()
    .first()

private fun replaceLetters(phrase: String) =
    phrase.replace(Regex(pattern = "[a-zA-Z]")) {
        when (it.value) {
            it.value -> " __ "
            else ->  "<>"
        }
    }


//fun howManyLetters(letter: Int): String {
//    var underscores =
//}
//
//fun showMeLetters(selectedWord: String): String {
//    for (letter in selectedWord) {
//
//    }
//
//}


fun main() {
    println(replaceLetters(selectedWord))
//    println(selectedWord)
}