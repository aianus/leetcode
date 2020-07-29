package com.alexianus.leetcode.problems.running_sum_of_d_array

object Solution {
  def runningSum(nums: Array[Int]): Array[Int] = {
    nums.scanLeft(0)(_ + _).tail
  }
}
