package com.alexianus.leetcode.problems.roman_to_integer

import com.alexianus.leetcode.UnitSpec

class SolutionSpec extends UnitSpec {
  it ("works for the given examples") {
    Solution.romanToInt("III") shouldBe 3
    Solution.romanToInt("IV") shouldBe 4
    Solution.romanToInt("IX") shouldBe 9
    Solution.romanToInt("LVIII") shouldBe 58
    Solution.romanToInt("MCMXCIV") shouldBe 1994
  }
}
