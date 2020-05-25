package com.alexianus.leetcode.problems.deepest_leaves_sum

class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
  var value: Int = _value
  var left: TreeNode = _left
  var right: TreeNode = _right
}

object Solution {
  def deepestLeavesSumInternal(root: TreeNode, depth: Int): (Int, Int) = {
    if (root.left == null && root.right == null) {
      return (depth, root.value)
    } else if (root.left == null) {
      return deepestLeavesSumInternal(root.right, depth + 1)
    } else if (root.right == null) {
      return deepestLeavesSumInternal(root.left, depth + 1)
    } else {
      val left = deepestLeavesSumInternal(root.left, depth + 1)
      val right = deepestLeavesSumInternal(root.right, depth + 1)

      if (left._1 == right._1) {
        return (left._1, left._2 + right._2)
      } else if (left._1 > right._1) {
        return (left._1, left._2)
      } else {
        return (right._1, right._2)
      }
    }
  }


  def deepestLeavesSum(root: TreeNode): Int = {
    if (root == null) {
      return 0
    } else {
      return deepestLeavesSumInternal(root, 0)._2
    }
  }
}
