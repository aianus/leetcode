package com.alexianus.leetcode.problems.top_k_frequent_elements

import scala.collection.mutable

object Solution {
  def topKFrequent(nums: Array[Int], k: Int): List[Int] = {
    val countMap = new mutable.HashMap[Int, Int]

    nums foreach { num =>
      val newValue = countMap.getOrElse(num, 0) + 1
      countMap.put(num, newValue)
    }

    val inverseCountMap = new mutable.HashMap[Int, mutable.Set[Int]] with mutable.MultiMap[Int, Int]
    val counts = new mutable.BitSet
    countMap foreach { case (value, count) =>
      inverseCountMap.addBinding(count, value)
      counts.add(count)
    }

    val topCounts = counts.takeRight(k).toList.reverse
    val result = topCounts flatMap { count =>
      inverseCountMap.get(count).get.toList.sorted
    }

    return result.take(k)
  }
}
