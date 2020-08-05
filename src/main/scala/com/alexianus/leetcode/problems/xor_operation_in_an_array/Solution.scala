package com.alexianus.leetcode.problems.xor_operation_in_an_array

object Solution {
  def xorOperation(n: Int, start: Int): Int = {
    Range(0, n)
      .map(_ * 2 + start)
      .fold(0)(_ ^ _)
  }
}
