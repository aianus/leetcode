package com.alexianus.leetcode.problems.subsets

object Solution {
  def subsetsInternal(set: Set[Int]): Set[Set[Int]] = {
    if (set.isEmpty) {
      return Set(Set.empty[Int])
    }

    val head = set.head
    val subSolutions = subsetsInternal(set.tail)

    val newSolutions = for {
      subSolution <- subSolutions
    } yield subSolution + head

    return subSolutions union newSolutions
  }

  def subsets(nums: Array[Int]): List[List[Int]] = {
    subsetsInternal(nums.toSet).map(_.toList).toList
  }
}
