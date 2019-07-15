package com.alexianus.leetcode.problems.palindrome_linked_list

import com.alexianus.leetcode.problems.ListNode

object Solution {
  def isPalindrome(head: ListNode): Boolean = {
    var reverseList = List.empty[Int]

    var it = head
    while (it != null) {
      reverseList = it.x :: reverseList
      it = it.next
    }

    it = head
    var reverse_it = reverseList
    while (reverse_it.nonEmpty) {
      if (it.x != reverse_it.head) {
        return false
      }
      it = it.next
      reverse_it = reverse_it.tail
    }
    return true
  }
}
