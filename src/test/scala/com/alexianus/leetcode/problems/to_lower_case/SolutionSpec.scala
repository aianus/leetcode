package com.alexianus.leetcode.problems.to_lower_case

import com.alexianus.leetcode.UnitSpec

class SolutionSpec extends UnitSpec {
  it("works for the given test cases") {
    Solution.toLowerCase("Hello") shouldBe "hello"
    Solution.toLowerCase("") shouldBe ""
    Solution.toLowerCase("hello") shouldBe "hello"
    Solution.toLowerCase("HeLLo") shouldBe "hello"
  }
}
