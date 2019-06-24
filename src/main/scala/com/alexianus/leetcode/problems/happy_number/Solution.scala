package com.alexianus.leetcode.problems.happy_number

import scala.collection.mutable.Set;

object Solution {
  def isHappy(n: Int): Boolean = {
    val seen = Set.empty[Int]

    var x = n
    while (!seen.contains(x)) {
      seen.add(x)

      val squareDigits = for {
        c <- x.toString
        d = c.asDigit
      } yield d * d

      x = squareDigits.sum
    }

    return x == 1
  }
}
