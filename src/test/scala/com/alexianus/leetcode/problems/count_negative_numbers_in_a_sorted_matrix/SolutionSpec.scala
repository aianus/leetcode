package com.alexianus.leetcode.problems.count_negative_numbers_in_a_sorted_matrix

import com.alexianus.leetcode.UnitSpec

class SolutionSpec extends UnitSpec {
  it ("does binary search") {
    Solution.findFirstNegative(Array(4, 3, 2, -1)) shouldBe Some(3)
    Solution.findFirstNegative(Array(-1, -1, -2, -3)) shouldBe Some(0)
    Solution.findFirstNegative(Array(1,1,-1,-2)) shouldBe Some(2)
    Solution.findFirstNegative(Array(1,1,-1,-2)) shouldBe Some(2)
    Solution.findFirstNegative(Array(3, 2)) shouldBe None
    Solution.findFirstNegative(Array(1, 0)) shouldBe None
    Solution.findFirstNegative(Array(1, -1)) shouldBe Some(1)
    Solution.findFirstNegative(Array(-1, -1)) shouldBe Some(0)
  }

  it ("works for the given examples") {
    val input = Array(
      Array(4,3,2,-1),
      Array(3,2,1,-1),
      Array(1,1,-1,-2),
      Array(-1,-1,-2,-3)
    )

    Solution.countNegatives(input) shouldBe 8
  }
}
