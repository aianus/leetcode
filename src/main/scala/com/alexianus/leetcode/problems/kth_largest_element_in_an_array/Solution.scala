package com.alexianus.leetcode.problems.kth_largest_element_in_an_array

object Solution {
  def findKthSmallest(nums: Array[Int], k: Int): Int = {
    val pivotIndex = scala.util.Random.nextInt(nums.length)

    val pivot = nums(pivotIndex)
    val smaller = nums.filter(_ < pivot)
    val same = nums.filter(_ == pivot)
    val larger = nums.filter(_ > pivot)

    if (k < smaller.length) {
      return findKthSmallest(smaller, k)
    } else if (k < (smaller.length + same.length)) {
      return same(k - smaller.length)
    } else {
      return findKthSmallest(larger, k - smaller.length - same.length)
    }
  }

  def findKthLargest(nums: Array[Int], k: Int): Int = findKthSmallest(nums, nums.length - k)
}
