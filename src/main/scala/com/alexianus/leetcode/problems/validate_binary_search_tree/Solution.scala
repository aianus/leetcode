package com.alexianus.leetcode.problems.validate_binary_search_tree

import scala.util.Try

class TreeNode(var _value: Int) {
  var value: Int = _value
  var left: TreeNode = null
  var right: TreeNode = null
}

case class InternalResult(isValid: Boolean, max: Option[Int], min: Option[Int])

object Solution {
  def isValidBSTInternal(root: TreeNode): InternalResult = {
    if (root == null) {
      return InternalResult(true, None, None)
    }

    val leftResult = isValidBSTInternal(root.left)
    val rightResult = isValidBSTInternal(root.right)

    val newMax = List(leftResult.max, rightResult.max, Some(root.value)).flatten.max
    val newMin = List(leftResult.min, rightResult.min, Some(root.value)).flatten.min

    val isValid =
      leftResult.isValid &&
      rightResult.isValid &&
        (leftResult.max.isEmpty || leftResult.max.get < root.value) &&
        (rightResult.min.isEmpty || rightResult.min.get > root.value)

    return InternalResult(isValid, Some(newMax), Some(newMin))
  }

  def isValidBST(root: TreeNode): Boolean = {
    isValidBSTInternal(root).isValid
  }
}