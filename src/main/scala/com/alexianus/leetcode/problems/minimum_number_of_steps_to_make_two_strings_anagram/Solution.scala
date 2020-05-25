package com.alexianus.leetcode.problems.minimum_number_of_steps_to_make_two_strings_anagram

object Solution {
  def minSteps(s: String, t: String): Int = {
    val sCounts = s.groupBy(identity).mapValues(_.size)
    val tCounts = t.groupBy(identity).mapValues(_.size)

    var diff = 0
    for {
      letter <- sCounts.keySet union tCounts.keySet
      sCount = sCounts.getOrElse(letter, 0)
      tCount = tCounts.getOrElse(letter, 0)
    } diff += (sCount - tCount).abs

    diff / 2
  }
}
