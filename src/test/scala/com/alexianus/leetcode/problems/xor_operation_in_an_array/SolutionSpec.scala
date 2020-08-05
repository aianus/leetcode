package com.alexianus.leetcode.problems.xor_operation_in_an_array

import com.alexianus.leetcode.UnitSpec

class SolutionSpec extends UnitSpec {
  it ("works for the given examples") {
    Solution.xorOperation(5, 0) shouldBe 8
    Solution.xorOperation(4, 3) shouldBe 8
    Solution.xorOperation(1, 7) shouldBe 7
  }
}
