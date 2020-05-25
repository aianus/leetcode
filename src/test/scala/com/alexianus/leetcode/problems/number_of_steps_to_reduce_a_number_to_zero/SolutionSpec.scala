package com.alexianus.leetcode.problems.number_of_steps_to_reduce_a_number_to_zero

import com.alexianus.leetcode.UnitSpec

class SolutionSpec extends UnitSpec {
  it ("works for the given examples") {
    Solution.numberOfSteps(14) shouldBe 6
    Solution.numberOfSteps(8) shouldBe 4
  }
}
