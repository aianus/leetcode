package com.alexianus.leetcode.problems.majority_element

import scala.util.Random

object Solution {
  def majorityElement(nums: Array[Int]): Int = {
    val pivotIndex = Random.nextInt(nums.length)
    val pivot = nums(pivotIndex)

    val smaller = nums filter (_ <= pivot)
    val same = nums filter (_ == pivot)
    val larger = nums filter (_ > pivot)

    if (same.length >= smaller.length && same.length >= larger.length) {
      return pivot
    } else if (smaller.length > larger.length) {
      return majorityElement(smaller)
    } else {
      return majorityElement(larger)
    }
  }
}
