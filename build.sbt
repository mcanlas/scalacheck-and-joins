scalaVersion := "2.12.12"

libraryDependencies += "org.typelevel"  %% "cats-effect" % "2.1.4"
libraryDependencies += "org.scalatest"  %% "scalatest"   % "3.2.0" % "test"
libraryDependencies += "org.scalacheck" %% "scalacheck"  % "1.14.3" % "test"

scalafmtOnCompile := true
