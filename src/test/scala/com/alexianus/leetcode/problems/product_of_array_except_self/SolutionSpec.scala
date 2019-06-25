package com.alexianus.leetcode.problems.product_of_array_except_self

import com.alexianus.leetcode.UnitSpec

class SolutionSpec extends UnitSpec {
  it ("works for the given example") {
    Solution.productExceptSelf(Array(1,2,3,4)) shouldBe Array(24,12,8,6)
  }
}
