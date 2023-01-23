ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "testProject",
    libraryDependencies += "org.apache.spark" %% "spark-core" % "3.3.1"
  )