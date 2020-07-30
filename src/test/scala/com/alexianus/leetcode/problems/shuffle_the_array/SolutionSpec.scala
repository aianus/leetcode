package com.alexianus.leetcode.problems.shuffle_the_array

import com.alexianus.leetcode.UnitSpec

class SolutionSpec extends UnitSpec {
  it ("works for the given examples") {
    Solution.shuffle(Array(2,5,1,3,4,7), 3) shouldBe Array(2,3,5,4,1,7)
  }
}
