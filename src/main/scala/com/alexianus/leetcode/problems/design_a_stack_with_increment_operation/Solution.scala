package com.alexianus.leetcode.problems.design_a_stack_with_increment_operation

import math.min

class CustomStack(_maxSize: Int) {

  var mainStack = List.empty[Int]
  var length = 0

  def push(x: Int) {
    if (length == _maxSize) {
      return
    }
    mainStack = x :: mainStack
    length = length + 1
  }

  def pop(): Int = {
    if (length > 0) {
      val result = mainStack.head
      mainStack = mainStack.tail
      length = length - 1
      result
    } else {
      -1
    }
  }

  def increment(k: Int, `val`: Int): Unit = {
    val numToIncrement = min(k, length)
    mainStack = mainStack.take(length - numToIncrement) ::: mainStack.takeRight(numToIncrement).map(_ + `val`)
  }

}
