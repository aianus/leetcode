package com.alexianus.leetcode.problems.final_prices_with_a_special_discount_in_a_shop

import com.alexianus.leetcode.UnitSpec

class SolutionSpec extends UnitSpec {
  it ("works for the given examples") {
    Solution.finalPrices(Array(8,4,6,2,3)) shouldBe Array(4,2,4,2,3)
  }
}
