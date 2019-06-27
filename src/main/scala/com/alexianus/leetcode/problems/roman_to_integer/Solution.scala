package com.alexianus.leetcode.problems.roman_to_integer

object Solution {

  def romanValue(c: Char): Int = c match {
    case 'I' => 1
    case 'V' => 5
    case 'X' => 10
    case 'L' => 50
    case 'C' => 100
    case 'D' => 500
    case 'M' => 1000
  }

  def romanToInt(s: String): Int = {
    var result = 0
    var before = Option.empty[Char]

    for (i <- 0 to s.length) {
      if (before.nonEmpty) {
        if (i >= s.length) {
          result += romanValue(before.get)
          return result
        }

        if (romanValue(before.get) < romanValue(s(i))) {
          result = result + romanValue(s(i)) - romanValue(before.get)
          before = None
        } else {
          result = result + romanValue(before.get)
          before = Some(s(i))
        }
      } else {
        if (i >= s.length) {
          return result
        } else {
          before = Some(s(i))
        }
      }
    }

    return result
  }
}
