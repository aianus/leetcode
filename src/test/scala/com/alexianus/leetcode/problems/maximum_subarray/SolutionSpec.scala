package com.alexianus.leetcode.problems.maximum_subarray

import com.alexianus.leetcode.UnitSpec

class SolutionSpec extends UnitSpec {
  it("works for the given test cases") {
    Solution.maxSubArray(Array(-2,1,-3,4,-1,2,1,-5,4)) shouldBe 6
    Solution.maxSubArray(Array(-6,-2,-3,-4,-1)) shouldBe -1
    Solution.maxSubArray(Array(-1,0)) shouldBe 0
  }
}
