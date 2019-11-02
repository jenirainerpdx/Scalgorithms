package com.jentest.Sort

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class InsertionSortTest extends FunSuite {

  test("simple sort ") {
    val actual = InsertionSort.isort(List(5,12,4))
    assertResult(List(4,5,12))(actual)
  }

  test("Sort with negative values") {
    val actual = InsertionSort.isort(List(9,-10,14,-8,-24,5,8,-1))
    assertResult(List(-24,-10,-8,-1,5,8,9,14))(actual)
  }

  test("Sort an empty list") {
    val actual = InsertionSort.isort(List())
    assertResult(List())(actual)
  }


}
