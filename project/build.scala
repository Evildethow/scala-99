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

  lazy val project = Project(
    "project",
    file("."),
    settings = gcsettings ++ Seq(gcTask)
  ) aggregate(
    problemOne, problemTwo, problemThree, problemFour, problemFive, problemSix,
    problemSeven, problemEight, problemNine, problemTen)

  lazy val problemOne = Project(
    "problem-one",
    file("01-problem-one"),
    settings = gcsettings ++ Seq(gcTask) ++ Seq(libraryDependencies := testDependencies)
  )

  lazy val problemTwo = Project(
    "problem-two",
    file("02-problem-two"),
    settings = gcsettings ++ Seq(gcTask) ++ Seq(libraryDependencies := testDependencies)
  )

  lazy val problemThree = Project(
    "problem-three",
    file("03-problem-three"),
    settings = gcsettings ++ Seq(gcTask) ++ Seq(libraryDependencies := testDependencies)
  )

  lazy val problemFour = Project(
    "problem-four",
    file("04-problem-four"),
    settings = gcsettings ++ Seq(gcTask) ++ Seq(libraryDependencies := testDependencies)
  )

  lazy val problemFive = Project(
    "problem-five",
    file("05-problem-five"),
    settings = gcsettings ++ Seq(gcTask) ++ Seq(libraryDependencies := testDependencies)
  )

  lazy val problemSix = Project(
    "problem-six",
    file("06-problem-six"),
    settings = gcsettings ++ Seq(gcTask) ++ Seq(libraryDependencies := testDependencies)
  )

  lazy val problemSeven = Project(
    "problem-seven",
    file("07-problem-seven"),
    settings = gcsettings ++ Seq(gcTask) ++ Seq(libraryDependencies := testDependencies)
  )

  lazy val problemEight = Project(
    "problem-eight",
    file("08-problem-eight"),
    settings = gcsettings ++ Seq(gcTask) ++ Seq(libraryDependencies := testDependencies)
  )

  lazy val problemNine = Project(
    "problem-nine",
    file("09-problem-nine"),
    settings = gcsettings ++ Seq(gcTask) ++ Seq(libraryDependencies := testDependencies)
  )

  lazy val problemTen = Project(
    "problem-ten",
    file("10-problem-ten"),
    settings = gcsettings ++ Seq(gcTask) ++ Seq(libraryDependencies := testDependencies)
  ) dependsOn problemNine
}

