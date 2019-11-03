package com.jentest.Sort

object InsertionSort {
  def isort[T](xs: List[T])(implicit ord: Ordering[T]): List[T] = xs match {
    case List() => List()
    case y :: ys => insert(y, isort(ys))(ord)
  }

  def insert[T](x: T, xs: List[T])(ord: Ordering[T]): List[T] = xs match {
    case List() => List[T](x)
    case y :: ys =>
      if (ord.lteq(x,y)) x :: xs
      else y :: insert(x, ys)(ord)
  }
}
