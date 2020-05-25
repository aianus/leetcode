package com.alexianus.leetcode.problems.how_many_numbers_are_smaller_than_the_current_number

object Solution {
  def smallerNumbersThanCurrent(nums: Array[Int]): Array[Int] = {
    val numIndices = nums.indices.groupBy { idx => nums(idx) }
    val sortedNums = nums.sorted

    val result = Array.ofDim[Int](nums.size)
    var i = sortedNums.size - 1
    while ( i >= 0 ) {
      val currentNum = sortedNums(i)
      while ( i >= 0 && sortedNums(i) == currentNum ) {
        i -= 1
      }
      val resultForNum = i + 1
      for {
        pos <- numIndices(currentNum)
      } result(pos) = resultForNum
    }

    result
  }
}
