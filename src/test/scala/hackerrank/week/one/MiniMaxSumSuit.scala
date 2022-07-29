package com.interview
package hackerrank.week.one

import org.scalatest.funsuite.AnyFunSuite

import java.io.{ByteArrayOutputStream, StringReader}
import scala.io.StdIn

class MiniMaxSumSuit extends AnyFunSuite {
  test("Mini Max Sum Simple Test Case 0") {
    val inputStr = "1 2 3 4 5"
    val in = new StringReader(inputStr)
    val out = new ByteArrayOutputStream()
    Console.withOut(out) {
      Console.withIn(in) {
        val arr = StdIn.readLine().replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
        MiniMaxSum.miniMaxSum(arr)
      }
    }

    assert(out.toString == "10 14")
  }

  test("Mini Max Sum Simple Test Case 1") {
    val inputStr = "7 69 2 221 8974"
    val in = new StringReader(inputStr)
    val out = new ByteArrayOutputStream()
    Console.withOut(out) {
      Console.withIn(in) {
        val arr = StdIn.readLine().replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
        MiniMaxSum.miniMaxSum(arr)
      }
    }

    assert(out.toString == "299 9271")
  }

  test("Mini Max Sum Test Case 1") {
    val inputStr = "256741038 623958417 467905213 714532089 938071625"
    val in = new StringReader(inputStr)
    val out = new ByteArrayOutputStream()
    Console.withOut(out) {
      Console.withIn(in) {
        val arr = StdIn.readLine().replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
        MiniMaxSum.miniMaxSum(arr)
      }
    }

    assert(out.toString == "2063136757 2744467344")
  }

  test("Mini Max Sum Test Case 2") {
    val inputStr = """396285104 573261094 759641832 819230764 364801279""".stripMargin
    val in = new StringReader(inputStr)
    val out = new ByteArrayOutputStream()
    Console.withOut(out) {
      Console.withIn(in) {
        val arr = StdIn.readLine().replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
        MiniMaxSum.miniMaxSum(arr)
      }
    }

    assert(out.toString == "2093989309 2548418794")
  }

  test("Mini Max Sum Test Case 3") {
    val inputStr = "140638725 436257910 953274816 734065819 362748590"
    val in = new StringReader(inputStr)
    val out = new ByteArrayOutputStream()
    Console.withOut(out) {
      Console.withIn(in) {
        val arr = StdIn.readLine().replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
        MiniMaxSum.miniMaxSum(arr)
      }
    }

    assert(out.toString == "1673711044 2486347135")
  }

  test("Mini Max Sum Test Case 4") {
    val inputStr = "769082435 210437958 673982045 375809214 380564127"
    val in = new StringReader(inputStr)
    val out = new ByteArrayOutputStream()
    Console.withOut(out) {
      Console.withIn(in) {
        val arr = StdIn.readLine().replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
        MiniMaxSum.miniMaxSum(arr)
      }
    }

    assert(out.toString == "1640793344 2199437821")
  }

  test("Mini Max Sum Test Case 5") {
    val inputStr = "156873294 719583602 581240736 605827319 895647130"
    val in = new StringReader(inputStr)
    val out = new ByteArrayOutputStream()
    Console.withOut(out) {
      Console.withIn(in) {
        val arr = StdIn.readLine().replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
        MiniMaxSum.miniMaxSum(arr)
      }
    }

    assert(out.toString == "2063524951 2802298787")
  }

  test("Mini Max Sum Test Case 6") {
    val inputStr = "426980153 354802167 142980735 968217435 734892650"
    val in = new StringReader(inputStr)
    val out = new ByteArrayOutputStream()
    Console.withOut(out) {
      Console.withIn(in) {
        val arr = StdIn.readLine().replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
        MiniMaxSum.miniMaxSum(arr)
      }
    }

    assert(out.toString == "1659655705 2484892405")
  }

  test("Mini Max Sum Test Case 7") {
    val inputStr = "942381765 627450398 954173620 583762094 236817490"
    val in = new StringReader(inputStr)
    val out = new ByteArrayOutputStream()
    Console.withOut(out) {
      Console.withIn(in) {
        val arr = StdIn.readLine().replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
        MiniMaxSum.miniMaxSum(arr)
      }
    }

    assert(out.toString == "2390411747 3107767877")
  }

  test("Mini Max Sum Test Case 8") {
    val inputStr = "539674108 549382170 270968351 746219035 140597628"
    val in = new StringReader(inputStr)
    val out = new ByteArrayOutputStream()
    Console.withOut(out) {
      Console.withIn(in) {
        val arr = StdIn.readLine().replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
        MiniMaxSum.miniMaxSum(arr)
      }
    }

    assert(out.toString == "1500622257 2106243664")
  }

  test("Mini Max Sum Test Case 9") {
    val inputStr = "254961783 604179258 462517083 967304281 860273491"
    val in = new StringReader(inputStr)
    val out = new ByteArrayOutputStream()
    Console.withOut(out) {
      Console.withIn(in) {
        val arr = StdIn.readLine().replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
        MiniMaxSum.miniMaxSum(arr)
      }
    }

    assert(out.toString == "2181931615 2894274113")
  }

  test("Mini Max Sum Test Case 10") {
    val inputStr = "501893267 649027153 379408215 452968170 487530619"
    val in = new StringReader(inputStr)
    val out = new ByteArrayOutputStream()
    Console.withOut(out) {
      Console.withIn(in) {
        val arr = StdIn.readLine().replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
        MiniMaxSum.miniMaxSum(arr)
      }
    }

    assert(out.toString == "1821800271 2091419209")
  }

  test("Mini Max Sum Test Case 11") {
    val inputStr = "140537896 243908675 670291834 923018467 520718469"
    val in = new StringReader(inputStr)
    val out = new ByteArrayOutputStream()
    Console.withOut(out) {
      Console.withIn(in) {
        val arr = StdIn.readLine().replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
        MiniMaxSum.miniMaxSum(arr)
      }
    }

    assert(out.toString == "1575456874 2357937445")
  }

  test("Mini Max Sum Test Case 12") {
    val inputStr = "793810624 895642170 685903712 623789054 468592370"
    val in = new StringReader(inputStr)
    val out = new ByteArrayOutputStream()
    Console.withOut(out) {
      Console.withIn(in) {
        val arr = StdIn.readLine().replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
        MiniMaxSum.miniMaxSum(arr)
      }
    }

    assert(out.toString == "2572095760 2999145560")
  }

  test("Mini Max Sum Test Case 13") {
    val inputStr = "5 5 5 5 5"
    val in = new StringReader(inputStr)
    val out = new ByteArrayOutputStream()
    Console.withOut(out) {
      Console.withIn(in) {
        val arr = StdIn.readLine().replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
        MiniMaxSum.miniMaxSum(arr)
      }
    }

    assert(out.toString == "20 20")
  }

  test("Mini Max Sum Test Case 14") {
    val inputStr = "7 69 2 221 8974"
    val in = new StringReader(inputStr)
    val out = new ByteArrayOutputStream()
    Console.withOut(out) {
      Console.withIn(in) {
        val arr = StdIn.readLine().replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
        MiniMaxSum.miniMaxSum(arr)
      }
    }

    assert(out.toString == "299 9271")
  }
}
