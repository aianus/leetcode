package com.alexianus.leetcode.problems.number_of_good_pairs

import com.alexianus.leetcode.UnitSpec

class SolutionSpec extends UnitSpec {
  it ("works for the given examples") {
    Solution.numIdenticalPairs(Array(1,1,1,1)) shouldBe 6
    Solution.numIdenticalPairs(Array(1,2,3,1,1,3)) shouldBe 4
  }
}
