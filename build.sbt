val scala3Version = "3.8.1"

lazy val root = project
  .in(file("."))
  .enablePlugins(CucumberPlugin)
  .settings(
    name := "Hello Scala Cucumber",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    CucumberPlugin.glues := List("steps"),
    libraryDependencies ++=
      Dependencies.zio ++
        Dependencies.cucumber ++
        Dependencies.munit,
//    libraryDependencies += "junit" % "junit" % "4.13.2",
    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % Test,
    Test / testOptions := Seq(Tests.Argument(TestFrameworks.JUnit, "-a"))
  )
