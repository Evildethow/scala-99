import sbt._
import Keys._

object Dependencies {
  val testDependencies = Seq(
    "org.scalatest" % "scalatest_2.9.2" % "2.0.M5b"
  )
}

object build extends Build {

  import Dependencies._

  val gcsettings = Defaults.defaultSettings

  val gc = TaskKey[Unit]("gc", "runs garbage collector")
  val gcTask = gc := {
    println("requesting garbage collection")
    System gc()
  }



  val someVal = libraryDependencies

  lazy val project = Project (
    "project",
    file("."),
    settings = gcsettings ++ Seq(gcTask)
  ) aggregate problemOne

  lazy val problemOne = Project (
    "problem-one",
    file("problem-one"),
    settings = gcsettings ++ Seq(gcTask) ++ Seq (libraryDependencies := testDependencies)
  )
}
