package com.alexianus.leetcode.problems.number_of_good_pairs

object Solution {
  def numIdenticalPairs(nums: Array[Int]): Int = {
    var counts = nums.groupBy(identity).mapValues(_.size).toMap
    var result: Int = 0
    for (i <- nums.indices) {
      val newCount = counts(nums(i)) - 1
      result = result + newCount
      counts = counts + (nums(i) -> newCount)
    }
    result
  }
}
