package com.alexianus.leetcode.problems.generate_parantheses

import com.alexianus.leetcode.UnitSpec

class SolutionSpec extends UnitSpec {
  it ("works for zero") {
    Solution.generateParenthesisInternal(0) shouldBe Set("")
  }

  it ("works for one") {
    Solution.generateParenthesisInternal(1) shouldBe Set("()")
  }

  it ("works for two") {
    Solution.generateParenthesisInternal(2) shouldBe Set("()()", "(())")
  }

  it ("works for three") {
    Solution.generateParenthesisInternal(3) shouldBe Set(
      "()()()",
      "(())()",
      "()(())",
      "(()())",
      "((()))"
    )
  }
}
