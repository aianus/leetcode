package com.alexianus.leetcode.problems.permutations

object Solution {
  def permuteInternal(nums: Set[Int]): Set[List[Int]] = {
    if (nums.size == 1) {
      return Set(List(nums.head))
    }

    val head = nums.head
    val subSolutions = permuteInternal(nums.tail)

    for {
      subSolution <- subSolutions
      insertionIndex <- 0 to subSolution.length
      (left, right) = subSolution.splitAt(insertionIndex)
    } yield (left :+ head) ++ right
  }

  def permute(nums: Array[Int]): List[List[Int]] = {
    permuteInternal(nums.toSet).toList
  }
}
