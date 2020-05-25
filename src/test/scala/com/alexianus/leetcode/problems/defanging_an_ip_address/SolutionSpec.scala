package com.alexianus.leetcode.problems.defanging_an_ip_address

import com.alexianus.leetcode.UnitSpec

class SolutionSpec extends UnitSpec {
  it ("works for the given examples") {
    Solution.defangIPaddr("1.1.1.1") shouldBe "1[.]1[.]1[.]1"
    Solution.defangIPaddr("255.100.50.0") shouldBe "255[.]100[.]50[.]0"
  }
}
