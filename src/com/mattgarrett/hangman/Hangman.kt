package com.mattgarrett.hangman
import java.io.File


const val lives: Int = 5
val selectedWord by lazy { selectWord() }
var userGuess = readLine()
var userGuess2 = userGuess.toString()[0]
    get() = field.toLowerCase()


// Function to select a word from file.
fun selectWord() = File("data/Words.txt")
    .readLines()
    .shuffled()
    .first()




fun guessLetters(letter: Char) {
    var selection = selectedWord.toCharArray()
    if (letter in ) {
        print(letter)
    }
}


fun main() {
//    println(">> Please enter a letter: ")
    guessLetters(userGuess2)

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
//// Function to replace chosen word with underscores so player can see amount of letters in word
//private fun replaceLetters(phrase: String) =
//    phrase.replace(Regex(pattern = "[a-zA-Z]")) {
//        when (it.value) {
//            it.value -> " __ "
//            else ->  "<?>"
//        }
//    }

//private fun reverseLetters(phrase: String) =
//    phrase.replace(Regex(pattern = "[_]")) {
//        when ()
//    }
