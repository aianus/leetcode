package com.alexianus.leetcode.problems.unique_morse_code_words

object Solution {
  def uniqueMorseRepresentations(words: Array[String]): Int = {
    val letters = Array(".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..")

    val transform = (letter: Char) => {
      val index = letter - 'a'
      letters(index)
    }

    val transformedWords = for {
      word <- words
      transformedWord = word.map(transform).mkString
    } yield transformedWord

    transformedWords.toSet.size
  }
}
