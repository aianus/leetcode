package com.alexianus.leetcode.problems.shuffle_an_array

import scala.collection.mutable.ArrayBuffer

class Solution(_nums: Array[Int]) {

  /** Resets the array to its original configuration and return it. */
  def reset(): Array[Int] = {
    return _nums;
  }

  /** Returns a random shuffling of the array. */
  def shuffle(): Array[Int] = {
    val r = scala.util.Random
    val positions = new ArrayBuffer[Int]
    positions.appendAll(_nums.indices)
    val result = new ArrayBuffer[Int]
    while (!positions.isEmpty) {
      val randomPositionIndex = r.nextInt(positions.length)
      val randomPosition = positions(randomPositionIndex)
      positions.remove(randomPositionIndex)
      result.append(_nums(randomPosition))
    }

    return result.toArray
  }

}

/**
  * Your Solution object will be instantiated and called as such:
  * var obj = new Solution(nums)
  * var param_1 = obj.reset()
  * var param_2 = obj.shuffle()
  */