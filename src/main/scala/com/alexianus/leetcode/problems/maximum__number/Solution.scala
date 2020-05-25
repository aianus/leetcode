package com.alexianus.leetcode.problems.maximum__number

object Solution {
  def maximum69Number (num: Int): Int = {
    num.toString.replaceFirst("6", "9").toInt
  }
}
