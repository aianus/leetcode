package com.alexianus.leetcode.problems.partition_labels

object Solution {
  def partitionLabels(S: String): List[Int] = {
    if (S.isEmpty) {
      return List.empty[Int]
    }

    var lettersInPartition = Set.empty[Char] + S.head
    var lettersInRestCount = S.tail.toCharArray.groupBy(identity).mapValues(_.size).toMap

    for (i <- Range(1, S.length)) {
      if (lettersInRestCount.keySet.intersect(lettersInPartition).isEmpty) {
        return i :: partitionLabels(S.substring(i))
      }

      lettersInPartition = lettersInPartition + S(i)
      lettersInRestCount = lettersInRestCount + (S(i) -> (lettersInRestCount(S(i)) - 1))
      if (lettersInRestCount(S(i)) == 0) {
        lettersInRestCount = lettersInRestCount - S(i)
      }
    }

    List(S.length)
  }
}
