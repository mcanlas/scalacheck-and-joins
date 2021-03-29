scalaVersion := "2.12.12"

libraryDependencies += "org.typelevel"  %% "cats-effect" % "3.0.0"
libraryDependencies += "org.scalatest"  %% "scalatest"   % "3.2.6"  % "test"
libraryDependencies += "org.scalacheck" %% "scalacheck"  % "1.14.3" % "test"

scalafmtOnCompile := true
