lazy val commonSettings = Seq(
  organization := "xyz.nowhere",
  scalaVersion := "2.12.10"
)

lazy val rootProject = (project in file("."))
  .settings(commonSettings: _*)
  .settings(publishArtifact := false, name := "graalvm-tests")
  .aggregate(filesyncer)


lazy val filesyncer: Project = (project in file("filesyncer"))
  .settings(commonSettings: _*)
  .enablePlugins(GraalVMNativeImagePlugin)
  .settings(
    name := "filesyncer",
   libraryDependencies ++= Seq(
      "com.github.pathikrit" %% "better-files" % "3.7.1"
    )
  )
 