package com.alexianus.leetcode.problems.merge_k_sorted_lists

import com.alexianus.leetcode.problems.ListNode

import scala.collection.mutable.ListBuffer

object Solution {

  implicit def convertToList(shitInput: ListNode): List[Int] = {
    if (shitInput == null) {
      Nil
    } else {
      shitInput.x :: convertToList(shitInput.next)
    }
  }

  implicit def convertToShitList(list: List[Int]): ListNode = list match {
    case Nil => null
    case head :: tail => {
      val result = new ListNode(head)
      result.next = convertToShitList(tail)
      result
    }
  }

  def mergeKLists(lists: Array[List[Int]]): List[Int] = {
    val listsCopy = lists.clone
    val result = new ListBuffer[Int]

    while (listsCopy exists { _.nonEmpty }) {
      val heads = for {
        i <- listsCopy.indices if listsCopy(i).nonEmpty
        head = listsCopy(i).head
      } yield (head, i)

      val min = heads.min
      result.append(min._1)
      listsCopy(min._2) = listsCopy(min._2).tail
    }

    return result.toList
  }

  def mergeKLists(lists: Array[ListNode]): ListNode = {
    val actualInput: Array[List[Int]] = lists map convertToList
    mergeKLists(actualInput)
  }
}
