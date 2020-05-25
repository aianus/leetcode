package com.alexianus.leetcode.problems.find_n_unique_integers_sum_up_to_zero

import scala.collection.mutable

object Solution {
  def sumZero(n: Int): Array[Int] = {
    val res = mutable.Set.empty[Int]

    if (n % 2 == 1) {
      res.add(0)
    }

    for (i <- Range.inclusive(1, n/2 )) {
      res.add(i)
      res.add(0 - i)
    }

    res.toArray
  }
}
