scalaVersion := "2.12.11"

libraryDependencies += "org.typelevel"  %% "cats-effect" % "2.1.2"
libraryDependencies += "org.scalatest"  %% "scalatest"   % "3.1.1" % "test"
libraryDependencies += "org.scalacheck" %% "scalacheck"  % "1.14.2" % "test"

scalafmtOnCompile := true
