package com.alexianus.leetcode.problems.perfect_squares

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer
import scala.math.{pow, min}

object Solution {
  val memo = new mutable.HashMap[Int, Int]
  lazy val ints: Stream[Int] = 1 #:: ints.map(_ + 1)
  lazy val perfectSquares: Stream[Int] = ints.map{ i => pow(i, 2).toInt }

  def numSquares(n: Int): Int = {
    val results = ArrayBuffer.fill[Int](n + 1)(Int.MaxValue)

    results(0) = 0
    for (i <- Range.inclusive(1, n)) {
      for (square <- perfectSquares.takeWhile(_ <= i)) {
        results(i) = min(results(i), 1 + results(i - square))
      }
    }

    return results(n)
  }
}
