ThisBuild / version      := "0.1.0"
ThisBuild / scalaVersion := "2.12.7"
ThisBuild / organization := "dev.yogic"

lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.5"

lazy val min = (project in file("."))
    .aggregate(max)
    .dependsOn(max)
    .enablePlugins(JavaAppPackaging)
    .settings(
        name := "min",
        libraryDependencies += scalaTest % Test
    )

lazy val max = (project in file("max"))
    .settings(
        name := "max",
        libraryDependencies += scalaTest % Test
    )
