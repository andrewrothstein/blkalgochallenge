package com.bfm

case class Position(totalPositions :Int, pos :Int, antCount :Int) {
  val step = if (pos == antCount || pos == antCount || Prime.is(pos)) -1 else 1

  def next = {
    if (pos + step < 0) { 
      Position(totalPositions, totalPositions - (pos + step), antCount)
    } else if (pos + step >= totalPositions) {
       Position(totalPositions, (pos + step) - totalPositions, antCount)
    } else {
      Position(totalPositions, pos + step, antCount)
    }
  }
}

case class Table(totalPositions :Int) {
  def agg(positions :List[Position])

object C5 extends App {
  println("Hello, blkalgochallenges")
}
