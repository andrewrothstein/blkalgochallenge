package com.bfm

case class Ant(totalPos :Int, pos :Int, speed :Int) {

  def speedUp = Ant(totalPos, pos, 1 + speed)

  def effStep(s :Int) :Int = if (s < 0) {
    effStep(s + totalPos)
  } else if (s >= totalPos) {
    effStep(s - totalPos) 
  } else s

  def step = {
    val s = effStep(if (pos != 0 && pos != 1 && Prime.is(pos)) -speed else speed)
    val nextPos = (pos + s) % totalPos
    Ant(totalPos, nextPos, speed)
  }
}

case class Ring(ants :Seq[Ant]) {

  def this(totalPos :Int) = this(for (p <- Range(0, totalPos)) yield Ant(totalPos, p, 1))

  def step = {
    val nextAnts = ants map (_.step)
    val groupedByPos = nextAnts groupBy (a => a.pos)
    val (toSpeedUp, noSpeedUp) = groupedByPos partition (s => s._2.size > 1)
    val spedUp = toSpeedUp flatMap (a => a._2.map(_.speedUp))
    val notSpedUp = noSpeedUp flatMap (a => a._2)
    Ring((spedUp.toList ::: notSpedUp.toList) sortWith ((x, y) => (x.pos < y.pos)))
  }

  def isBalanced = ants groupBy (a => a.pos) forall (s => s._2.size == 1)
}

object C5 extends App {
  var r = new Ring(5)
  var cnt = 0;
  do {
    r = r.step; 
    cnt = cnt + 1
    println(cnt + ": " + r)
  } while (!r.isBalanced && cnt < 100)
}
