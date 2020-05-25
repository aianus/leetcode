package com.alexianus.leetcode.problems.decompress_runlength_encoded_list

object Solution {
  def decompressRLElist(nums: Array[Int]): Array[Int] = {
    val sublists = for {
      tup <-nums.sliding(2,2)
      freq = tup(0)
      value = tup(1)
    } yield Array.fill(freq){ value }

    sublists.toArray.flatten
  }
}
