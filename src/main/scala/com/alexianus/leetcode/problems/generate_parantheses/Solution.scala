package com.alexianus.leetcode.problems.generate_parantheses

object Solution {
  def generateParenthesisInternal(n: Int): Set[String] = {
    if (n == 0)
      return Set("")

    val subSolutions = generateParenthesisInternal(n - 1)

    for {
      subSolution <- subSolutions
      insertionIndex <- 0 to subSolution.length
      (left, right) = subSolution.splitAt(insertionIndex)
    } yield left + "()" + right
  }

  def generateParenthesis(n: Int): List[String] = {
    generateParenthesisInternal(n).toList
  }
}
