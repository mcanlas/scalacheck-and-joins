scalaVersion := "2.12.12"

libraryDependencies += "org.typelevel"  %% "cats-effect" % "2.2.0-RC1"
libraryDependencies += "org.scalatest"  %% "scalatest"   % "3.2.0" % "test"
libraryDependencies += "org.scalacheck" %% "scalacheck"  % "1.14.3" % "test"

scalafmtOnCompile := true
