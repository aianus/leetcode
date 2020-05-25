package com.alexianus.leetcode.problems.replace_elements_with_greatest_element_on_right_side

import com.alexianus.leetcode.UnitSpec

class SolutionSpec extends UnitSpec {
  it ("works for the given examples") {
    Solution.replaceElements(Array(17,18,5,4,6,1)) shouldBe Array(18,6,6,6,1,-1)
  }
}
