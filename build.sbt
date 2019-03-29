scalaVersion := "2.12.8"

libraryDependencies += "org.typelevel"  %% "cats-effect" % "1.2.0"
libraryDependencies += "org.scalatest"  %% "scalatest"   % "3.0.7" % "test"
libraryDependencies += "org.scalacheck" %% "scalacheck"  % "1.14.0" % "test"

scalafmtOnCompile := true
