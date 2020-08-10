package com.alexianus.leetcode.problems.final_prices_with_a_special_discount_in_a_shop

import scala.collection.mutable

object Solution {
  def finalPrices(prices: Array[Int]): Array[Int] = {
    for {
      i <- prices.indices.toArray
      currentPrice = prices(i)
      discount = prices.splitAt(i)._2.tail.dropWhile(_ > currentPrice ).headOption.getOrElse(0)
    } yield currentPrice - discount
  }
}
