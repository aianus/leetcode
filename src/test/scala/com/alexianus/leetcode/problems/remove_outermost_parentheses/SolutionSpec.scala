package com.alexianus.leetcode.problems.remove_outermost_parentheses

import com.alexianus.leetcode.UnitSpec

class SolutionSpec extends UnitSpec {
  it ("works for the given examples") {
    Solution.removeOuterParentheses("(()())(())") shouldBe "()()()"
  }
}
