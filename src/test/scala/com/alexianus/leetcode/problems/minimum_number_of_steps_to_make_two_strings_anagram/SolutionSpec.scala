package com.alexianus.leetcode.problems.minimum_number_of_steps_to_make_two_strings_anagram

import com.alexianus.leetcode.UnitSpec

class SolutionSpec extends UnitSpec {
  it ("works for the given examples") {
    Solution.minSteps("aba", "bab") shouldBe 1
  }
}
