package com.alexianus.leetcode.problems.group_anagrams

import scala.collection.mutable

object Solution {
  def groupAnagrams(strs: Array[String]): List[List[String]] = {
    val charMapsToWords = strs groupBy { str =>
      val charCounts = mutable.HashMap.empty[Char, Int]
      str foreach { char =>
        charCounts.put(char, charCounts.getOrElse(char, 0) + 1)
      }
      charCounts
    }

    charMapsToWords.values.toList map { _.toList }
  }
}
