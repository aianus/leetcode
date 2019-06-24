package com.alexianus.leetcode.problems.range_sum_of_bst

class TreeNode(var _value: Int) {
  var value: Int = _value
  var left: TreeNode = null
  var right: TreeNode = null
}

object Solution {
  def rangeSumBST(root: TreeNode, L: Int, R: Int): Int = {
    if (root == null) {
      return 0
    }

    var result = 0
    if (root.value <= R && root.value >= L) {
      result += root.value
    }
    if (root.value <= R) {
      result += rangeSumBST(root.right, L, R)
    }
    if (root.value >= L) {
      result += rangeSumBST(root.left, L, R)
    }

    return result
  }
}
