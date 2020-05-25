package com.alexianus.leetcode.problems.increasing_decreasing_string

import com.alexianus.leetcode.UnitSpec

class SolutionSpec extends UnitSpec {
  it ("works for the given examples") {
    Solution.sortString("aaaabbbbcccc") shouldBe "abccbaabccba"
  }
}
