package com.alexianus.leetcode.problems.shuffle_string

object Solution {
  def restoreString(s: String, indices: Array[Int]): String = {
    val result = indices
      .zip(s.toCharArray)
      .sortBy(_._1)
      .map(_._2)

    new String(result)
  }
}
