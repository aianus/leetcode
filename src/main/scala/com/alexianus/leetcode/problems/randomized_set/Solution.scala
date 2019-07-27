package com.alexianus.leetcode.problems.randomized_set

import scala.collection.mutable

class RandomizedSet() {

  /** Initialize your data structure here. */
  var mapPart = mutable.HashMap.empty[Int, Int]
  var setPart = mutable.Set.empty[Int]
  var arrPart = mutable.ArrayBuffer.empty[Option[Int]]

  val random = new scala.util.Random

  /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
  def insert(`val`: Int): Boolean = {
    if (setPart.contains(`val`)) {
      return false
    }

    setPart.add(`val`)
    arrPart.append(Some(`val`))
    mapPart.put(`val`, arrPart.length - 1)
    return true
  }

  /** Removes a value from the set. Returns true if the set contained the specified element. */
  def remove(`val`: Int): Boolean = {
    if (!setPart.contains(`val`)) {
      return false
    }

    val index = mapPart(`val`)
    arrPart(index) = None
    setPart.remove(`val`)
    mapPart.remove(`val`)
    return true
  }

  /** Get a random element from the set. */
  def getRandom(): Int = {
    if (setPart.size == 0) {
      throw new IllegalStateException
    }

    var result: Option[Int] = None

    while (result.isEmpty) {
      val randomIdx = random.nextInt(arrPart.size)
      result = arrPart(randomIdx)
    }

    return result.get
  }

}

/**
  * Your RandomizedSet object will be instantiated and called as such:
  * var obj = new RandomizedSet()
  * var param_1 = obj.insert(`val`)
  * var param_2 = obj.remove(`val`)
  * var param_3 = obj.getRandom()
  */
