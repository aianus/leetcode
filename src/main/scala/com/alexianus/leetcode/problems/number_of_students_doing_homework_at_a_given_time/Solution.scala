package com.alexianus.leetcode.problems.number_of_students_doing_homework_at_a_given_time

object Solution {
  def busyStudent(startTime: Array[Int], endTime: Array[Int], queryTime: Int): Int = {
    val startsAndEnds = startTime zip endTime
    startsAndEnds.count{ case (startTime, endTime) => Range.inclusive(startTime, endTime).contains(queryTime) }
  }
}
