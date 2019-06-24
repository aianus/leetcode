package com.alexianus.leetcode.problems.to_lower_case

object Solution {
  def toLowerCase(str: String): String = str.map { c =>
    if (c <= 'Z' && c >= 'A')
      ('a' + (c - 'A')).asInstanceOf[Char]
    else
      c
  }
}
