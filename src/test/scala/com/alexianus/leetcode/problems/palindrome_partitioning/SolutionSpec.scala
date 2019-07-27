package com.alexianus.leetcode.problems.palindrome_partitioning

import com.alexianus.leetcode.UnitSpec

class SolutionSpec extends UnitSpec {
  it("works for the given test cases") {
    Solution.partition("aab").toSet shouldBe Set(
      List("aa", "b"),
      List("a", "a", "b")
    )
  }
}
