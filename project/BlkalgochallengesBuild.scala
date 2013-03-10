import sbt._
import sbt.Keys._

object BlkalgochallengesBuild extends Build {

  lazy val blkalgochallenges = Project(
    id = "blkalgochallenges",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "blkalgochallenges",
      organization := "com.bfm",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.10.0"
      // add other settings here
//     , libraryDependencies ++= Seq("com.typesafe" %% "scalalogging-slf4j" % "1.0.1")
    )
  )

  
}
