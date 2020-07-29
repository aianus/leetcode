package com.alexianus.leetcode.problems.running_sum_of_d_array

import com.alexianus.leetcode.UnitSpec

class SolutionSpec extends UnitSpec {
  it ("works for the given examples") {
    Solution.runningSum(Array(1,2,3,4)) shouldBe Array(1,3,6,10)
  }
}
