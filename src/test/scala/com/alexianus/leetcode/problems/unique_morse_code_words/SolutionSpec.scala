package com.alexianus.leetcode.problems.unique_morse_code_words

import com.alexianus.leetcode.UnitSpec

class SolutionSpec extends UnitSpec {
  it ("works for the given examples") {
    Solution.uniqueMorseRepresentations(Array("gin", "zen", "gig", "msg")) shouldBe 2
  }
}
