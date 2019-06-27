package com.alexianus.leetcode.problems.valid_anagram

import com.alexianus.leetcode.UnitSpec

class SolutionSpec extends UnitSpec {
  it("works for the given test cases") {
    Solution.isAnagram("anagram", "nagaram") shouldBe true
    Solution.isAnagram("cat", "tar") shouldBe false
  }
}
