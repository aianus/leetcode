package com.alexianus.leetcode.problems.letter_tile_possibilities

object Solution {
  def tilePossibilities(tiles: String): Set[String] = {
    // num possibilites with "STRINNG" = num possibilities with STRING plus one for every position you can place the N in
    // except the N cannot be placed before another N

    if (tiles == "" || tiles == null) {
      return Set.empty[String]
    }

    val head = tiles.head
    val subSolutions = tilePossibilities(tiles.tail)
    val newSolutions = for {
      subSolution <- subSolutions
      insertionIndex <- 0 to subSolution.size
      if insertionIndex == subSolution.size || subSolution(insertionIndex) != head
      (firstPart, secondPart) = subSolution.splitAt(insertionIndex)
    } yield firstPart + head + secondPart

    return  subSolutions ++ newSolutions ++ Set(head.toString)
  }

  def numTilePossibilities(tiles: String): Int = {
    tilePossibilities(tiles).size
  }
}
