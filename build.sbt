ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "Interview",
    idePackagePrefix := Some("com.interview"),
    libraryDependencies := Seq(
      "org.scalactic" %% "scalactic" % "3.2.12",
      "org.scalatest" %% "scalatest" % "3.2.12" % "test"
    )
  )
