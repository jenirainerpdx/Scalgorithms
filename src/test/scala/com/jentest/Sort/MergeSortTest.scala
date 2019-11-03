package com.jentest.Sort

import org.scalatest.FunSuite

class MergeSortTest extends FunSuite {

  test("testMergeSort") {
    val actual = MergeSort.mergeSort(List(8,4,15,3,1))
    assertResult(List(1,3,4,8,15))(actual)
  }

  test("test merge sort with strings") {
    val actual = MergeSort.mergeSort(List("hi", "boo", "amazon"))
    assertResult(List("amazon", "boo", "hi"))(actual)
  }

}
