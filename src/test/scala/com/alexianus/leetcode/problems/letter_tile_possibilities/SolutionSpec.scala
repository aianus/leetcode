package com.alexianus.leetcode.problems.letter_tile_possibilities

import com.alexianus.leetcode.UnitSpec

class SolutionSpec extends UnitSpec {
  it("works for the given test case") {
    Solution.numTilePossibilities("AAABBC") shouldBe 188
  }
}
