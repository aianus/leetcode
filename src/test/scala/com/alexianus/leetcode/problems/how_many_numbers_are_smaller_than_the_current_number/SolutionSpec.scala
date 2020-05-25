package com.alexianus.leetcode.problems.how_many_numbers_are_smaller_than_the_current_number

import com.alexianus.leetcode.UnitSpec

class SolutionSpec extends UnitSpec {
  it ("works for the given examples") {
    Solution.smallerNumbersThanCurrent(Array(8,1,2,2,3)) shouldBe Array(4,0,1,1,3)
    Solution.smallerNumbersThanCurrent(Array(6,5,4,8)) shouldBe Array(2,1,0,3)
    Solution.smallerNumbersThanCurrent(Array(7,7,7,7)) shouldBe Array(0,0,0,0)
  }
}
