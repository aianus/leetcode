package com.alexianus.leetcode.problems.defanging_an_ip_address

object Solution {
  def defangIPaddr(address: String): String = {
    address.replaceAll("\\.", "[.]")
  }
}
