package com.alexianus.leetcode.problems.shuffle_string

import com.alexianus.leetcode.UnitSpec

class SolutionSpec extends UnitSpec {
  it ("works for the given examples") {
    Solution.restoreString("codeleet", Array(4,5,6,7,0,2,1,3)) shouldBe "leetcode"
  }
}
