package com.alexianus.leetcode.problems.kth_largest_element_in_an_array

import com.alexianus.leetcode.UnitSpec

class SolutionSpec extends UnitSpec {
  it("works for the given test cases") {
    Solution.findKthLargest(Array(3,2,1,5,6,4), 2) shouldBe 5
    Solution.findKthLargest(Array(3,2,3,1,2,4,5,5,6), 4) shouldBe 4
  }
}
