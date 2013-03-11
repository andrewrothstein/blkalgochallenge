package com.bfm

case class Ant(totalPos :Int, origPos :Int, pos :Int, speed :Int) {

  lazy val direction = if (origPos != 0 && origPos != 1 && Prime.is(origPos)) -1 else 1

  def speedUp = Ant(totalPos, origPos, pos, 1 + speed)

  def effStep(s :Int) :Int = if (s < 0) {
    effStep(s + totalPos)
  } else if (s >= totalPos) {
    effStep(s - totalPos) 
  } else s

  def step = {
    val s = effStep(direction * speed)
    val nextPos = (pos + s) % totalPos
    Ant(totalPos, origPos, nextPos, speed)
  }

  override def toString = "Ant #" + origPos + " @" + pos
}

case class Ring(ants :Seq[Ant]) {

  def this(totalPos :Int) = this(for (p <- Range(0, totalPos)) yield Ant(totalPos, p, p, 1))

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
  var r = new Ring(args(1).toInt)
  var cnt = 0;
  do {
    r = r.step; 
    cnt = cnt + 1
    println(cnt + ": " + r + ": " + (if (r.isBalanced) "balanced" else "not balanced"))
  } while (!r.isBalanced)
}
