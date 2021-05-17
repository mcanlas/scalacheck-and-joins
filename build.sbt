scalaVersion := "2.12.13"

libraryDependencies += "org.typelevel"  %% "cats-effect" % "3.1.1"
libraryDependencies += "org.scalatest"  %% "scalatest"   % "3.2.9"  % "test"
libraryDependencies += "org.scalacheck" %% "scalacheck"  % "1.14.3" % "test"

scalafmtOnCompile := true
