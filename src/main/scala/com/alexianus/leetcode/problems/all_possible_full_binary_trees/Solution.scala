package com.alexianus.leetcode.problems.all_possible_full_binary_trees

import scala.collection.mutable

class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
  var value: Int = _value
  var left: TreeNode = _left
  var right: TreeNode = _right
}

object Solution {
  val memo = mutable.Map.empty[Int, List[TreeNode]]

  def allPossibleFBT(N: Int): List[TreeNode] = {
    val memoized = memo.get(N)
    if (memoized.nonEmpty) {
      return memoized.get
    }

    if (N == 0) {
      memo.update(0,  List.empty[TreeNode])
      return memo(0)
    }

    if (N == 1) {
      memo.update(1,  List(new TreeNode))
      return memo(1)
    }

    val result = for {
      i <- Range(1, N - 2, 2).inclusive.toList
      subResultsLeft = allPossibleFBT(i)
      subResultsRight = allPossibleFBT(N - i - 1)
      subResultLeft <- subResultsLeft
      subResultRight <- subResultsRight
    } yield new TreeNode(0, subResultLeft, subResultRight)

    memo.update(N, result)
    memo(N)
  }
}
