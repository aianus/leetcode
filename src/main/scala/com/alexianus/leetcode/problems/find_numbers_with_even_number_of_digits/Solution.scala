package com.alexianus.leetcode.problems.find_numbers_with_even_number_of_digits

object Solution {
  def findNumbers(nums: Array[Int]): Int = {
    nums.map(_.toString.size % 2 == 0).count(identity)
  }
}
