val scala3Version = "3.2.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "Hello Scala Cucumber",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    libraryDependencies ++= Dependencies.munit ++ Dependencies.cucumber,
//    libraryDependencies += "junit" % "junit" % "4.13.2",
    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % Test,
    testOptions in Test := Seq(Tests.Argument(TestFrameworks.JUnit, "-a"))
  )
