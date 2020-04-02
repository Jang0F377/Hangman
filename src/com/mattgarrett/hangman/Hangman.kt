package com.mattgarrett.hangman
import java.io.File

// Const val of lives that never changes
const val lives: Int = 5
// Three Vars to use!
val selectedWord = selectWord() //inital var that will be the string to compare too will be plaintext but not printed
var selectedWord2 = replaceLetters(selectedWord) //var that replaces the letters of first var with underscores
var selectedWord3 = selectedWord2 // copy of above var to make changes to


//val selectedWord by lazy { selectWord() }
//var userGuess = readLine()
//var userGuess2 = userGuess.toString()[0]
//    get() = field.toLowerCase()


// Function to select a word from file.
fun selectWord() = File("data/Words.txt")
    .readLines()
    .shuffled()
    .first()


// Function to replace chosen word with underscores so player can see amount of letters in word
private fun replaceLetters(phrase: String) =
    phrase.replace(Regex(pattern = "[a-zA-Z]")) {
        when (it.value) {
            it.value -> " __ "
            else ->  "<?>"
        }
    }


fun findMatches(arg: String?) {


}



fun main() {


}


//// variable to hold the picked word in underscores
//val guessThisWord = replaceLetters(selectedWord)
//
//
//
//var printWhatToGuess = readLine()
//
//fun main() {
//    println(guessThisWord)
//    print("> Guess your letter: ")
//}

//private fun reverseLetters(phrase: String) =
//    phrase.replace(Regex(pattern = "[_]")) {
//        when ()
//    }
