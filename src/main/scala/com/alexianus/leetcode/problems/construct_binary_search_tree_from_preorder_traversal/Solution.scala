package com.alexianus.leetcode.problems.construct_binary_search_tree_from_preorder_traversal

class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
  var value: Int = _value
  var left: TreeNode = _left
  var right: TreeNode = _right
}

object Solution {
  def bstFromPreorder(preorder: Array[Int]): TreeNode = {
    if (preorder.isEmpty) {
      return null
    }

    val root = preorder.head
    val left = preorder.tail.takeWhile(_ < root)
    val right = preorder.tail.dropWhile(_ <= root)

    new TreeNode(root, bstFromPreorder(left), bstFromPreorder(right))
  }
}
