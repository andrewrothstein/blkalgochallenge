package com.bfm

object Prime {
  def is(n: Int) = (2 until n) forall (n % _ != 0)
}


