package com.alexianus.leetcode.problems.partition_labels

import com.alexianus.leetcode.UnitSpec

class SolutionSpec extends UnitSpec {
  it ("works for the given examples") {
    Solution.partitionLabels("ababcbacadefegdehijhklij") shouldBe List(9,7,8)
  }
}
