package com.alexianus.leetcode.problems.binary_search_tree_to_greater_sum_tree

class TreeNode(var _value: Int) {
  var value: Int = _value
  var left: TreeNode = null
  var right: TreeNode = null
}

object Solution {
  def bstToGst(root: TreeNode): TreeNode = {
    def bstToGstInternal(root: TreeNode, fromParent: Int): (TreeNode, Int) = {
      if (root == null)
        return (null, fromParent)

      val rightSolution = bstToGstInternal(root.right, fromParent)
      root.right = rightSolution._1
      val rightLeftMax = rightSolution._2

      val newVal = rightLeftMax + root.value
      root.value = newVal

      val leftSolution = bstToGstInternal(root.left, newVal)
      root.left = leftSolution._1

      return (root, leftSolution._2)
    }

    return bstToGstInternal(root, 0)._1
  }
}
