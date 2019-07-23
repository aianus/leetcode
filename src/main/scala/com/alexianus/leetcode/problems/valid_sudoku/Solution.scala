package com.alexianus.leetcode.problems.valid_sudoku

object Solution {

  val allowedCells = Set('1', '2', '3', '4', '5', '6', '7', '8', '9')

  def isValidSudokuSection[A <% Traversable[Char]](section: A): Boolean = {
    val notNullCells = section filter { _ != '.' }
    val setOfValues = notNullCells.toSet

    return setOfValues.subsetOf(allowedCells) && setOfValues.size == notNullCells.size
  }

  def isValidSudoku(board: Array[Array[Char]]): Boolean = {
    val rows = board
    val columns = Range(0,9) map { index =>
      board map { _(index) }
    }

    // Calculate sections
    val intervals = List(Range(0, 3), Range(3, 6), Range(6, 9))
    val sectionIntervals = for {
      x <- intervals
      y <- intervals
    } yield (x, y)
    val sections = sectionIntervals map { tervals =>
      for {
        i <- tervals._1
        j <- tervals._2
      } yield board(i)(j)
    }

    rows.forall(isValidSudokuSection) &&
    columns.forall(isValidSudokuSection) &&
    sections.forall(isValidSudokuSection)
  }
}