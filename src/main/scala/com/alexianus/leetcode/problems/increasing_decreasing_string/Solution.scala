package com.alexianus.leetcode.problems.increasing_decreasing_string

object Solution {
  def sortString(s: String): String = {
    var charCounts = s.groupBy(identity).mapValues(_.size).toMap
    val result = StringBuilder.newBuilder
    var loopIndex = 0
    while (!charCounts.isEmpty) {
      val sortedChars = collection.immutable.SortedSet[Char]() ++ charCounts.keySet
      if (loopIndex % 2 == 0) {
        result ++= sortedChars
      } else {
        result ++= sortedChars.toIndexedSeq.reverse
      }

      for (char <- sortedChars) {
        val newCount = charCounts(char) - 1
        if (newCount > 0) {
          charCounts = charCounts + (char -> newCount)
        } else {
          charCounts = charCounts - char
        }
      }
      loopIndex += 1
    }

    result.mkString
  }
}
