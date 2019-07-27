package com.alexianus.leetcode.problems.palindrome_partitioning

object Solution {
  def isPalindrome(s: String): Boolean = {
    s.reverse == s
  }

  def rawPartitionsInternal(reversedString: String): List[List[String]] = {
    if (reversedString == "") {
      return List.empty[List[String]]
    } else if (reversedString.size == 1) {
      return List(List(reversedString))
    }

    val head = reversedString.head
    val subResults = rawPartitionsInternal(reversedString.tail)
    val detachedResults = for {
      subResult <- subResults
      newResult = head.toString :: subResult
    } yield newResult
    val attachedResults = for {
      subResult <- subResults
      newResult = (head + subResult.head) :: subResult.tail
    } yield newResult

    val newResults = detachedResults ++ attachedResults


    // Prune possibilities where anything in the tail is not a palindrome
    val plausibleResults = newResults filter { newResult =>
      newResult.tail.find { substring => !(isPalindrome(substring)) } isEmpty
    }

    plausibleResults
  }

  def rawPartitions(s: String): List[List[String]] = {
    rawPartitionsInternal(s.reverse) map { _.reverse }
  }

  def partition(s: String): List[List[String]] = {
    rawPartitions(s) filter { _ forall isPalindrome }
  }
}

/*

b

a b
ab

a a b
a ab
aa b
aab


 */
