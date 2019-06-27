package com.alexianus.leetcode.problems.valid_anagram

import scala.collection.mutable
import scala.collection.Map

object Solution {
  def charCount(s: String): Map[Char, Int] = {
    val result = new mutable.HashMap[Char, Int]

    s foreach { c =>
      result.put(c, result.getOrElse(c, 0) + 1)
    }

    return result
  }

  def isAnagram(s: String, t: String): Boolean = {
    charCount(s) == charCount(t)
  }
}
