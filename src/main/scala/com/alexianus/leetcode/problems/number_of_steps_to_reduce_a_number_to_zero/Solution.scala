package com.alexianus.leetcode.problems.number_of_steps_to_reduce_a_number_to_zero

object Solution {
  def numberOfSteps (num: Int): Int = {
    if (num == 0) {
      0
    } else if (num % 2 == 0) {
      1 + numberOfSteps(num / 2)
    } else {
      1 + numberOfSteps(num - 1)
    }
  }
}
