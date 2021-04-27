scalaVersion := "2.12.13"

libraryDependencies += "org.typelevel"  %% "cats-effect" % "3.1.0"
libraryDependencies += "org.scalatest"  %% "scalatest"   % "3.2.8"  % "test"
libraryDependencies += "org.scalacheck" %% "scalacheck"  % "1.14.3" % "test"

scalafmtOnCompile := true
