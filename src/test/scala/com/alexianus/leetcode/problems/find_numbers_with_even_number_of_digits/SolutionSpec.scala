package com.alexianus.leetcode.problems.find_numbers_with_even_number_of_digits

import com.alexianus.leetcode.UnitSpec

class SolutionSpec extends UnitSpec {
  it ("works for the given examples") {
    Solution.findNumbers(Array(12,345,2,6,7896)) shouldBe 2
    Solution.findNumbers(Array(555,901,482,1771)) shouldBe 1
  }
}
