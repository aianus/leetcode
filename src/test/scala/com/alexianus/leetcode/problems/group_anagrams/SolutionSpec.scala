package com.alexianus.leetcode.problems.group_anagrams

import com.alexianus.leetcode.UnitSpec

class SolutionSpec extends UnitSpec {
  it("works for the given test cases") {
    val result = Solution.groupAnagrams(Array("eat", "tea", "tan", "ate", "nat", "bat")) map { _.toSet } toSet

    result shouldBe Set(
      Set("ate","eat","tea"),
      Set("nat","tan"),
      Set("bat")
    )
  }
}
