package com.alexianus.leetcode.problems.construct_binary_search_tree_from_preorder_traversal

import com.alexianus.leetcode.UnitSpec

class SolutionSpec extends UnitSpec {
  it ("works for the given examples") {
    Solution.bstFromPreorder(Array(8,5,1,7,10,12)) should not be(null)
  }
}
