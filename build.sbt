enablePlugins(OssLibPlugin)

organization := "com.newmotion"

name         := "uri-template"

description  := "URI Template"

libraryDependencies ++= {
  Seq(
    "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.5",
    "org.scalatest"          %% "scalatest"                % "3.0.1" % "test"
  )
}