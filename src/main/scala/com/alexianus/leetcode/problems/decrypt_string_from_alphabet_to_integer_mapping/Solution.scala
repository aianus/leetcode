package com.alexianus.leetcode.problems.decrypt_string_from_alphabet_to_integer_mapping

object Solution {
  val escapeSequence = """(\d\d)\#""".r
  val digit          = """(\d)""".r

  def freqAlphabets(s: String): String = {
    val step1 = escapeSequence
      .replaceAllIn(s, _ match {
        case escapeSequence(idx) => ('j' - 10 + idx.toInt).asInstanceOf[Char].toString
      })

    digit.replaceAllIn(step1, _ match {
      case digit(d) => (d.toInt - 1 + 'a').asInstanceOf[Char].toString
    })
  }
}
