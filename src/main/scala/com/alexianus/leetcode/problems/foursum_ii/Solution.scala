package com.alexianus.leetcode.problems.foursum_ii

import scala.collection.mutable

object Solution {

  def simpleSumMap(arr: Array[Int]): Map[Int, Int] = {
    val result = new mutable.HashMap[Int, Int]
    arr foreach { element =>
      result.put(element, result.getOrElse(element, 0) + 1)
    }
    result toMap
  }

  def addToSumMap(map: Map[Int, Int], arr: Array[Int]): Map[Int, Int] = {
    val result = new mutable.HashMap[Int, Int]
    for {
      (sum, numCombinations) <- map.toList
      newIdx <- arr.indices
      newSum = arr(newIdx) + sum
    } {
      result.put(newSum, result.getOrElse(newSum, 0) + numCombinations)
    }

    result toMap
  }

  def fourSumCount(A: Array[Int], B: Array[Int], C: Array[Int], D: Array[Int]): Int = {
    val aMap = simpleSumMap(A)
    val bMap = addToSumMap(aMap, B)

    var result = 0
    for {
      c <- C
      d <- D
    } {
      result = result + bMap.getOrElse(0 - c - d, 0)
    }

    return result
  }
}
