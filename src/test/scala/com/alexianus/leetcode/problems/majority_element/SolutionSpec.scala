package com.alexianus.leetcode.problems.majority_element

import com.alexianus.leetcode.UnitSpec

class SolutionSpec extends UnitSpec {
  it ("works for the given example") {
    Solution.majorityElement(Array(3,2,3)) shouldBe 3
  }
}
