package com.alexianus.leetcode.problems.max_increase_to_keep_city_skyline

object Solution {
  def maxIncreaseKeepingSkyline(grid: Array[Array[Int]]): Int = {
    // The maximum in each row is just the maximum in each row
    val maxRow = grid.map(_.max)

    val columns = (grid(0).indices).map(column => grid.map(row => row(column)))
    val maxColumn = columns.map(_.max)

    var solution = 0
    for {
      x <- grid.indices
      y <- grid(0).indices
    } solution += (List(maxRow(x), maxColumn(y)).min - grid(x)(y))

    return solution
  }
}
