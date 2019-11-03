package com.jentest.Sort

object MergeSort {
  def mergeSort[T](xs: List[T])(implicit ord: Ordering[T]): List[T] = {
    val n = xs.length / 2
    if (n == 0) xs
    else {
      def merge(xs: List[T], ys: List[T]): List[T] =
        (xs,ys) match {
          case (Nil, ys) => ys
          case (xs, Nil) => xs
          case (x :: xtail, y :: ytail) =>
            if (ord.lt(x,y)) x :: merge(xtail, ys)
            else y :: merge(xs, ytail)
        }

      val (first, second) = xs splitAt (n)
      merge(mergeSort(first)(ord), mergeSort(second)(ord))
    }
  }
}
