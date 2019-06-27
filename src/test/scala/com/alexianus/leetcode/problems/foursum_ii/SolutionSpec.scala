package com.alexianus.leetcode.problems.foursum_ii

import com.alexianus.leetcode.UnitSpec

class SolutionSpec extends UnitSpec {
  it ("works for the given example") {
    Solution.fourSumCount(
      Array(1, 2),
      Array(-2, -1),
      Array(-1, 2),
      Array(0, 2)
    ) shouldBe 2
  }
}
