package com.alexianus.leetcode.problems.letter_combinations_of_a_phone_number

object Solution {
  val keypadMap: Map[Char, Set[Char]] = Map(
    '2' -> Set('a', 'b', 'c'),
    '3' -> Set('d', 'e', 'f'),
    '4' -> Set('g', 'h', 'i'),
    '5' -> Set('j', 'k', 'l'),
    '6' -> Set('m', 'n', 'o'),
    '7' -> Set('p', 'q', 'r', 's'),
    '8' -> Set('t', 'u', 'v'),
    '9' -> Set('w', 'x', 'y', 'z')
  )

  def letterCombinations(digits: String): List[String] = {
    val blownUp = digits map keypadMap.apply

    blownUp.foldLeft(Set("")) { case (setOfWordPossibilities, charPossibilites) =>
      for {
        wordPossibility <- setOfWordPossibilities
        charPossibility <- charPossibilites
      } yield wordPossibility + charPossibility
    }.filter(_.length > 0).toList
  }
}
