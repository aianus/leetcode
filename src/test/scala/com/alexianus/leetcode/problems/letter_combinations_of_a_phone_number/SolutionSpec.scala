package com.alexianus.leetcode.problems.letter_combinations_of_a_phone_number

import com.alexianus.leetcode.UnitSpec

class SolutionSpec extends UnitSpec {
  it("works for the given test case") {
    Solution.letterCombinations("23").toSet shouldBe Set(
      "ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"
    )
  }
}
