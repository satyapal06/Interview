package com.interview
package hackerrank.week.one

import scala.io._

object MiniMaxSum {
  def main(args: Array[String]) {
    val arr = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
    miniMaxSum(arr)
  }

  def miniMaxSum(arr: Array[Int]) {
    val miniSum = arr.map(_.toLong).sorted.init.sum
    val maxSum = arr.map(_.toLong).sorted.tail.sum
    print(s"$miniSum $maxSum")
  }
}

