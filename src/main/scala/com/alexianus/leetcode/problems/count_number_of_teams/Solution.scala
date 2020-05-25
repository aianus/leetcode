package com.alexianus.leetcode.problems.count_number_of_teams

object Solution {
  def numTeamsInner(rating: Array[Int], teamSize: Int): Int = {
    if (teamSize == 0) {
      return 1
    }

    val subResults = for {
      i <- rating.indices.toList
      first = rating(i)
      rest = rating.slice(i + 1, rating.length)
      greaterRest = rest.filter(_ > first)
    } yield numTeamsInner(greaterRest, teamSize - 1)

    subResults.sum
  }

  def numTeams(rating: Array[Int]): Int = {
    numTeamsInner(rating, 3) + numTeamsInner(rating.reverse, 3)
  }
}
