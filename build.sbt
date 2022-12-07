ThisBuild / version := "1.0"
ThisBuild / scalaVersion := "2.12.16"
ThisBuild / organization := "org.example"

val spinalVersion = "1.8.0"
val spinalCore = "com.github.spinalhdl" %% "spinalhdl-core" % spinalVersion
val spinalLib = "com.github.spinalhdl" %% "spinalhdl-lib" % spinalVersion
val spinalTester = "com.github.spinalhdl" %% "spinalhdl-tester" % spinalVersion % Test
val spinalIdslPlugin = compilerPlugin("com.github.spinalhdl" %% "spinalhdl-idsl-plugin" % spinalVersion)

lazy val projectname = (project in file("hw/spinal"))
  .settings(
    libraryDependencies ++= Seq(spinalCore, spinalLib, spinalTester, spinalIdslPlugin)
  )

fork := true
