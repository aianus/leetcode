package com.alexianus.leetcode.problems.permutations

import com.alexianus.leetcode.UnitSpec

class SolutionSpec extends UnitSpec {
  it ("works for one element") {
    Solution.permuteInternal(Set(1)) shouldBe Set(List(1))
  }

  it ("works for two elements") {
    Solution.permuteInternal(Set(1, 2)) shouldBe Set(List(2,1), List(1,2))
  }

  it ("works for three elements") {
    Solution.permuteInternal(Set(1, 2, 3)) shouldBe Set(
      List(1, 2, 3),
      List(1, 3, 2),
      List(2, 1, 3),
      List(2, 3, 1),
      List(3, 1, 2),
      List(3, 2, 1)
    )
  }

  it("works for the given test cases") {
    Solution.permute(Array(1, 2, 3)).toSet shouldBe Set(
      List(1, 2, 3),
      List(1, 3, 2),
      List(2, 1, 3),
      List(2, 3, 1),
      List(3, 1, 2),
      List(3, 2, 1)
    )
  }
}
