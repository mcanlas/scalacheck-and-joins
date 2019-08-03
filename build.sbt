scalaVersion := "2.12.8"

libraryDependencies += "org.typelevel"  %% "cats-effect" % "2.0.0-M5"
libraryDependencies += "org.scalatest"  %% "scalatest"   % "3.0.8" % "test"
libraryDependencies += "org.scalacheck" %% "scalacheck"  % "1.14.0" % "test"

scalafmtOnCompile := true
