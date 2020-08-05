package com.alexianus.leetcode.problems.remove_outermost_parentheses

object Solution {
  def removeOuterParentheses(S: String): String = {
    var open = 0
    var splits = List.empty[Int]
    val result = new StringBuilder

    for {
      i <- S.indices
      c = S(i)
    } {
      if (open == 0) {
        splits = i :: splits
      }

      if (c == '(') {
        open = open + 1
      }

      if (c == ')') {
        open = open - 1
      }
    }

    splits = S.length :: splits

    for {
      List(from, to) <- splits.reverse.sliding(2)
      split = S.substring(from + 1, to - 1)
    } result ++= split

    result.toString
  }
}
