package com.alexianus.leetcode.problems.maximum_binary_tree

import scala.collection.SeqView

class TreeNode(var _value: Int) {
  var value: Int = _value
  var left: TreeNode = _
  var right: TreeNode = _
}

object Solution {
  def constructMaximumBinaryTree(nums: Array[Int]): TreeNode = {
    def constructMaximumBinaryTreeInternal(nums: Seq[Int]): TreeNode = {
      if (nums.isEmpty) {
        return null
      }

      var max = Int.MinValue
      var maxIndex = -1
      for {
        i <- nums.indices
        value = nums(i)
      } {
        if (value > max) {
          max = value
          maxIndex = i
        }
      }

      val result = new TreeNode(max)
      result.left = constructMaximumBinaryTreeInternal(nums.view(0, maxIndex))
      result.right = constructMaximumBinaryTreeInternal(nums.view(maxIndex + 1, nums.size))

      return result
    }

    return constructMaximumBinaryTreeInternal(nums.view)
  }
}
