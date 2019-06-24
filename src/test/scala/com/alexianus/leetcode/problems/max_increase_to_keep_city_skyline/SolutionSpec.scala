package com.alexianus.leetcode.problems.max_increase_to_keep_city_skyline

import com.alexianus.leetcode.UnitSpec

class SolutionSpec extends UnitSpec {
  it("works for the given test case") {
    Solution.maxIncreaseKeepingSkyline(Array(
      Array(3, 0, 8, 4),
      Array(2, 4, 5, 7),
      Array(9, 2, 6, 3),
      Array(0, 3, 1, 0)
    )) shouldBe 35
  }
}
