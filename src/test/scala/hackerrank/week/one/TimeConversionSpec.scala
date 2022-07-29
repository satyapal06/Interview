package com.interview
package hackerrank.week.one

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers

class TimeConversionSpec extends AnyFlatSpec with Matchers {
  "Simple test case 0 07:05:45PM" should "19:05:45" in {
    assert(TimeConversion.timeConversion("07:05:45PM") == "19:05:45")
  }

  "Test case 1 12:40:22AM" should "00:40:22" in {
    assert(TimeConversion.timeConversion("12:40:22AM") == "00:40:22")
  }

  "Test case 2 06:40:03AM" should "06:40:03" in {
    assert(TimeConversion.timeConversion("06:40:03AM") == "06:40:03")
  }

  "Test case 3 12:05:39AM" should "00:05:39" in {
    assert(TimeConversion.timeConversion("12:05:39AM") == "00:05:39")
  }

  "Test case 4 12:45:54PM" should "12:45:54" in {
    assert(TimeConversion.timeConversion("12:45:54PM") == "12:45:54")
  }

  "Test case 5 02:34:50PM" should "14:34:50" in {
    assert(TimeConversion.timeConversion("02:34:50PM") == "14:34:50")
  }

  "Test case 6 04:59:59AM" should "04:59:59" in {
    assert(TimeConversion.timeConversion("04:59:59AM") == "04:59:59")
  }

  "Test case 7 04:59:59PM" should "16:59:59" in {
    assert(TimeConversion.timeConversion("04:59:59PM") == "16:59:59")
  }
}
