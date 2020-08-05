package com.alexianus.leetcode.problems.number_of_students_doing_homework_at_a_given_time

import com.alexianus.leetcode.UnitSpec

class SolutionSpec extends UnitSpec {
  it ("works for the given examples") {
    Solution.busyStudent(Array(1,2,3), Array(3,2,7), 4) shouldBe 1
  }
}
