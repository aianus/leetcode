package com.alexianus.leetcode.problems.jewels_and_stones

object Solution {
  def numJewelsInStones(J: String, S: String): Int = {
    val sArray = S.toCharArray
    val jSet = J.toCharArray.toSet

    return sArray.map { x =>
      if (jSet.contains(x))
        1
      else
        0
    }.sum
  }
}

