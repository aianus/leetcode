package com.alexianus.leetcode.problems.balance_a_binary_search_tree

import scala.collection.mutable

class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
  var value: Int = _value
  var left: TreeNode = _left
  var right: TreeNode = _right
}

object Solution {

  def BSTtoSortedArray(root: TreeNode): Array[Int] = {
    def BSTtoSortedArrayInternal(root: TreeNode, result: mutable.ArrayBuilder[Int]): Unit = {
      if (root == null) {
        return
      }

      BSTtoSortedArrayInternal(root.left, result)
      result += root.value
      BSTtoSortedArrayInternal(root.right, result)
    }

    val result = mutable.ArrayBuilder.make[Int]
    BSTtoSortedArrayInternal(root, result)
    result.result
  }

  def sortedArrayToBST(arr: Array[Int]): TreeNode = {
    if (arr.isEmpty) {
      return null
    };

    val midpoint = arr.size / 2
    val midpointValue = arr(midpoint)
    val left = sortedArrayToBST(arr.take(midpoint))
    val right = sortedArrayToBST(arr.takeRight(arr.size - midpoint - 1))

    new TreeNode(midpointValue, left, right)
  }

  def balanceBST(root: TreeNode): TreeNode = {
    sortedArrayToBST(BSTtoSortedArray(root))
  }
}
