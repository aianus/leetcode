package com.alexianus.leetcode.problems.decompress_runlength_encoded_list

import com.alexianus.leetcode.UnitSpec

class SolutionSpec extends UnitSpec {
  it ("works for the given examples") {
    Solution.decompressRLElist(Array(1,2,3,4)) shouldBe Array(2,4,4,4)
    Solution.decompressRLElist(Array(1,1,2,3)) shouldBe Array(1,3,3)
  }
}
