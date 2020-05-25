package com.alexianus.leetcode.problems.replace_elements_with_greatest_element_on_right_side

object Solution {
  def replaceElements(arr: Array[Int]): Array[Int] = {
    val res = Array.fill[Int](arr.size)(-1)
    var max = -1
    for (i <- arr.indices.reverse) {
      res(i) = max
      max = List(max, arr(i)).max
    }
    res
  }
}
