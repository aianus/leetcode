package com.alexianus.leetcode.problems.subtract_product_and_sum

object Solution {
  def subtractProductAndSum(n: Int): Int = {
    val digits = n.abs.toString.map(_ - '0')
    val product = digits.product
    val sum = digits.sum

    product - sum
  }
}
