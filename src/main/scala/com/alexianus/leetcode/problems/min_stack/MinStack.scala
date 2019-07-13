package com.alexianus.leetcode.problems.min_stack

class MinStack() {

  case class MinStackNode(value: Int, min: Int)

  var myStack : List[MinStackNode] = List.empty

  def push(x: Int) {
    val newMin = myStack match {
      case Nil => x
      case head :: _ => List(head.min, x).min
    }

    val node = MinStackNode(x, newMin)
    myStack = node :: myStack
  }

  def pop() {
    if (myStack.isEmpty) {
      throw new Error("Cannot pop empty MinStack")
    }

    myStack = myStack.tail
  }

  def top(): Int = {
    if (myStack.isEmpty) {
      throw new Error("Cannot top of empty MinStack")
    }

    myStack.head.value
  }

  def getMin(): Int = {
    if (myStack.isEmpty) {
      throw new Error("Cannot getMin of empty MinStack")
    }

    myStack.head.min
  }

}

/**
  * Your MinStack object will be instantiated and called as such:
  * var obj = new MinStack()
  * obj.push(x)
  * obj.pop()
  * var param_3 = obj.top()
  * var param_4 = obj.getMin()
  */
