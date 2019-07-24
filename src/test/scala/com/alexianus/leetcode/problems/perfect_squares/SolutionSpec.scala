package com.alexianus.leetcode.problems.perfect_squares

import com.alexianus.leetcode.UnitSpec

class SolutionSpec extends UnitSpec {
  it("works for the given test cases") {
    Solution.numSquares(12) shouldBe 3
    Solution.numSquares(13) shouldBe 2
  }
}
