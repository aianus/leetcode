package com.alexianus.leetcode.problems.count_negative_numbers_in_a_sorted_matrix

object Solution {
  def findFirstNegative(vec: Array[Int]): Option[Int] = {
    if (vec.size == 0) {
      return None
    }

    val trialIndex = vec.size / 2
    val trialValue = vec(trialIndex)
    if (trialValue < 0) {
      val recurse = findFirstNegative(vec.slice(0, trialIndex))
      recurse match {
        case Some(index) => recurse
        case None => Some(trialIndex)
      }
    } else {
      val recurse = findFirstNegative(vec.slice(trialIndex + 1, vec.size))
      recurse match {
        case Some(index) => Some(trialIndex + 1 + index)
        case None => None
      }
    }
  }

  def countNegatives(grid: Array[Array[Int]]): Int = {
    (for {
      row <- grid
      firstNegative <- findFirstNegative(row)
      numNegatives = if (firstNegative >= 0) row.size - firstNegative else 0
    } yield numNegatives).sum
  }
}
