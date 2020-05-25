package com.alexianus.leetcode.problems.decrypt_string_from_alphabet_to_integer_mapping

import com.alexianus.leetcode.UnitSpec

class SolutionSpec extends UnitSpec {
  it ("works for the given examples") {
    Solution.freqAlphabets("10#11#12") shouldBe "jkab"
  }
}
