package com.alexianus.leetcode.problems.shuffle_the_array

object Solution {
  def shuffle(nums: Array[Int], n: Int): Array[Int] = {
    val (x, y) = nums.splitAt(n)
    (x zip y) flatMap { case (xi, yi) => Array(xi, yi) }
  }
}
