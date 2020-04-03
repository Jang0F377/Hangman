package com.mattgarrett.hangman

import java.io.File

fun pickAWord() = File("data/Words.txt")
    .readLines()
    .shuffled()
    .first()
