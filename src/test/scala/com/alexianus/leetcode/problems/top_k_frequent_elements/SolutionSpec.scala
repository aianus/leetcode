package com.alexianus.leetcode.problems.top_k_frequent_elements

import com.alexianus.leetcode.UnitSpec

class SolutionSpec extends UnitSpec {
  it ("works for a single element") {
    Solution.topKFrequent(Array(1), 1) shouldBe Array(1)
  }

  it ("works for the given test case") {
    Solution.topKFrequent(Array(1,1,1,2,2,3), 2) shouldBe Array(1, 2)
  }

  it ("works for another test case") {
    Solution.topKFrequent(Array(4,1,-1,2,-1,2,3), 2) shouldBe Array(-1, 2)
  }
}
