package com.alexianus.leetcode.problems.final_prices_with_a_special_discount_in_a_shop

import scala.collection.mutable

object Solution {
  def finalPrices(prices: Array[Int]): Array[Int] = {
    val result = Array.fill[Int](prices.size)(0)
    val maxPricesToDiscounts = mutable.SortedMap.empty[Int, List[Int]]
    for (i <- prices.indices.reverse) {
      val currentPrice = prices(i)
      val discount = maxPricesToDiscounts.to(currentPrice).lastOption.map(_._2.head).getOrElse(0)
      result(i) = currentPrice - discount

      val newKeySet = maxPricesToDiscounts.keySet + currentPrice
      for (key <- newKeySet.from(currentPrice)) {
        maxPricesToDiscounts.update(key, prices(i) :: maxPricesToDiscounts.getOrElse(key, List.empty[Int]))
      }
    }

    result
  }
}


