scalaVersion := "2.12.9"

libraryDependencies += "org.typelevel"  %% "cats-effect" % "2.0.0-RC2"
libraryDependencies += "org.scalatest"  %% "scalatest"   % "3.0.8" % "test"
libraryDependencies += "org.scalacheck" %% "scalacheck"  % "1.14.0" % "test"

scalafmtOnCompile := true
