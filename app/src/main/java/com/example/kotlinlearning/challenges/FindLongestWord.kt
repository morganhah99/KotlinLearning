package com.example.kotlinlearning.challenges

fun main() {

    /**
     * Given a string, implement a function which returns longest word in that string.
     * If there are two or more words that have the same length, return the first longest word from the string.
     * Ignore punctuation. Input string can't be empty or blank string.
     */
    val word = "Sunsets painters the sky in hues of orange and pink"
   println(findLongestWord(word))

}

fun findLongestWord(value: String): String {
    val words = value.split(" ")
    var characterCount = 0
    var longestWord = ""
    var longestWords = mutableListOf("")
    for (word in words) {
        if (word.length >= characterCount) {
            longestWords.add(word)
            characterCount = word.length
        }
    }
    for (word in longestWords) {
        if (word.length == characterCount) {
            longestWord = word
            break
        }
    }
    return longestWord
}


