package com.alexianus.leetcode.problems.subsets

import com.alexianus.leetcode.UnitSpec

class SolutionSpec extends UnitSpec {
  it ("works for the given example") {
    Solution.subsetsInternal(Set(1,2,3)) shouldBe Set(
      Set.empty[Int],
      Set(1),
      Set(2),
      Set(3),
      Set(1,2),
      Set(1,3),
      Set(1, 2, 3),
      Set(2, 3)
    )
  }
}
