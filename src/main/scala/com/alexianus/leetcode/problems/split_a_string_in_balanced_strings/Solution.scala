package com.alexianus.leetcode.problems.split_a_string_in_balanced_strings

object Solution {
  def balancedStringSplit(s: String): Int = {
    var r = 0
    var l = 0
    var res = 0

    for (i <- s.indices) {
      if (s(i) == 'R') {
        r += 1
      } else {
        l += 1
      }
      if (r != 0 && r == l) {
        res += 1
        l = 0
        r = 0
      }
    }

    res
  }
}
