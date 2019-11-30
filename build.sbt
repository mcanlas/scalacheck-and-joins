scalaVersion := "2.12.10"

libraryDependencies += "org.typelevel"  %% "cats-effect" % "2.0.0"
libraryDependencies += "org.scalatest"  %% "scalatest"   % "3.1.0" % "test"
libraryDependencies += "org.scalacheck" %% "scalacheck"  % "1.14.2" % "test"

scalafmtOnCompile := true
