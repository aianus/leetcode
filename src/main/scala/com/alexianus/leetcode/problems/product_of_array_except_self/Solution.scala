package com.alexianus.leetcode.problems.product_of_array_except_self

object Solution {
  def productExceptSelf(nums: Array[Int]): Array[Int] = {
    val result = Array.ofDim[Int](nums.length)

    result(0) = 1
    for (i <- 1 until nums.length) {
      result(i) = result(i-1) * nums(i-1)
    }

    var prod = 1
    for (i <- (0 to nums.length - 1).reverse) {
      result(i) *= prod
      prod *= nums(i)
    }

    return result
  }
}

// 1, 2, 3, 4
// 24, 12, 8, 6

// bcd acd abd abc
