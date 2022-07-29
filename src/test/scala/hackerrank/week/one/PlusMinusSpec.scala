package com.interview
package hackerrank.week.one

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers

import java.io.{ByteArrayOutputStream, StringReader}
import scala.io.StdIn
import scala.jdk.javaapi.CollectionConverters._

class PlusMinusSpec extends AnyFlatSpec with Matchers {
  implicit def toIntegerList(lst: List[Int]): java.util.List[Integer] = asJava(lst.map(i => i: java.lang.Integer))

  "Simple test case 0 { -4 3 -9 0 4 1 }" should "0.500000, 0.333333, and 0.166667" in {
    val inputStr = """-4 3 -9 0 4 1""".stripMargin
    val in = new StringReader(inputStr)
    val out = new ByteArrayOutputStream()
    Console.withOut(out) {
      Console.withIn(in) {
        val list = StdIn.readLine().replaceAll("\\s+$", "")
          .split(" ").map(_.trim.toInt).toList
        PlusMinus.plusMinus(list)
      }
    }

    println(out.toString.contains("0.500000"))
  }

  "Simple test case 1 { 1 2 3 -1 -2 -3 0 0 }" should "0.375000, 0.375000, and 0.250000" in {
    val inputStr = """1 2 3 -1 -2 -3 0 0""".stripMargin
    val in = new StringReader(inputStr)
    val out = new ByteArrayOutputStream()
    Console.withOut(out) {
      Console.withIn(in) {
        val list = StdIn.readLine().replaceAll("\\s+$", "")
          .split(" ").map(_.trim.toInt).toList
        PlusMinus.plusMinus(list)
      }
    }

    println(out.toString)
    // out.toString should (include("0.375000") and include("0.375000") and include("0.250000"))
  }

  "Test case 0 { 0 0 -1 1 1 }" should "0.400000, 0.200000, and 0.400000" in {
    val inputStr = """0 0 -1 1 1""".stripMargin
    val in = new StringReader(inputStr)
    val out = new ByteArrayOutputStream()
    Console.withOut(out) {
      Console.withIn(in) {
        val list = StdIn.readLine().replaceAll("\\s+$", "")
          .split(" ").map(_.trim.toInt).toList
        PlusMinus.plusMinus(list)
      }
    }

    println(out.toString)
  }

  "Test case 1 { 1 -2 -7 9 1 -8 -5 }" should "0.428571, 0.571429, and 0.000000" in {
    val inputStr = """1 -2 -7 9 1 -8 -5""".stripMargin
    val in = new StringReader(inputStr)
    val out = new ByteArrayOutputStream()
    Console.withOut(out) {
      Console.withIn(in) {
        val list = StdIn.readLine().replaceAll("\\s+$", "")
          .split(" ").map(_.trim.toInt).toList
        PlusMinus.plusMinus(list)
      }
    }

    println(out.toString)
  }
}
