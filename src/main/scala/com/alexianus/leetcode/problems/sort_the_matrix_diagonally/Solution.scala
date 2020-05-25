package com.alexianus.leetcode.problems.sort_the_matrix_diagonally

object Solution {
  def diagonalStartToPositions(mat: Array[Array[Int]], start: (Int, Int)): Array[(Int, Int)] = {
    val startRow = start._1
    val startCol = start._2
    for {
      pos <- (Range(startRow, mat.size) zip Range(startCol, mat(0).size)).toArray
    } yield pos
  }

  def extractDiagonal(mat: Array[Array[Int]], startPos: (Int, Int)): Array[Int] = {
    val diagonalPositions = diagonalStartToPositions(mat, startPos)
    diagonalPositions map { case(x, y) => mat(x)(y) }
  }

  def diagonalSort(mat: Array[Array[Int]]): Array[Array[Int]] = {
    val rows = mat.indices
    val cols = mat(0).indices.drop(1)
    val leftStrip = rows map { x => (x, 0) }
    val topStrip = cols map { x => (0, x) }

    val diagonalStarts = leftStrip ++ topStrip

    val sortedDiagonals = for {
      diagonalStart <- diagonalStarts.toArray
      extractedDiagonal = extractDiagonal(mat, diagonalStart)
      sortedDiagonal = extractedDiagonal.sorted
    } yield sortedDiagonal

    for {
      diagonalIdx <- diagonalStarts.indices
      diagonalStart = diagonalStarts(diagonalIdx)
      sortedDiagonal = sortedDiagonals(diagonalIdx)
      diagonalPositions = diagonalStartToPositions(mat, diagonalStart)
      ((row, col), value) <- diagonalPositions zip sortedDiagonal
    } mat(row)(col) = value

    mat
  }
}
