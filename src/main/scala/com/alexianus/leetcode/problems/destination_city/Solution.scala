package com.alexianus.leetcode.problems.destination_city

object Solution {
  def destCity(paths: List[List[String]]): String = {
    val cities = paths.flatten.toSet
    val sourceCities = paths.map(_.head).toSet
    (cities -- sourceCities).head
  }
}
