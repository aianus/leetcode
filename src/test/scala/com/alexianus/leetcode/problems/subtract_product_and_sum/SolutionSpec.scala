package com.alexianus.leetcode.problems.subtract_product_and_sum

import com.alexianus.leetcode.UnitSpec

class SolutionSpec extends UnitSpec {
  it ("works for the given examples") {
    Solution.subtractProductAndSum(234) shouldBe 15
    Solution.subtractProductAndSum(4421) shouldBe 21
  }
}
