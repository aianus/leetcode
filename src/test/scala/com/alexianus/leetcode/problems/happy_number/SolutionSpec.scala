package com.alexianus.leetcode.problems.happy_number

import com.alexianus.leetcode.UnitSpec

class SolutionSpec extends UnitSpec {
  it ("works for 1") {
    Solution.isHappy(1) shouldBe true
  }

  it ("works for 19") {
    Solution.isHappy(19) shouldBe true
  }

  it ("works for 20") {
    Solution.isHappy(20) shouldBe false
  }
}
