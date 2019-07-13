package com.alexianus.leetcode.problems.maximum_subarray

object Solution {
  def maxSubArray(nums: Array[Int]): Int = {
    val negativeNumbers = nums.filter(_ < 0)

    if (negativeNumbers.isEmpty) {
      return nums.sum
    }

    var maxSum = negativeNumbers.max
    var maxSumCandidate = Option.empty[Int]
    for (num <- nums) {
      if (maxSumCandidate.isEmpty && num >= 0) {
        maxSumCandidate = Some(num)
        maxSum = List(maxSum, maxSumCandidate.get).max
      } else if (maxSumCandidate.nonEmpty && maxSumCandidate.get + num < 0) {
        maxSumCandidate = None
      } else if (maxSumCandidate.nonEmpty) {
        maxSumCandidate = Some(maxSumCandidate.get + num)
        maxSum = List(maxSum, maxSumCandidate.get).max
      }
    }

    return maxSum
  }
}

// [-2,1,-3,4,-1,2,1,-5,4]