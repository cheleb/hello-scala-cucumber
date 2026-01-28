import sbt._

object Dependencies {
  object Versions {
    val cucumberJUnit = "7.33.0"
    val cucumberScala = "8.23.1"
    val zio = "2.1.24"
  }
  val zio = Seq("dev.zio" %% "zio" % Versions.zio)
  val munit = Seq("org.scalameta" %% "munit" % "1.2.2" % Test)
  val cucumber = Seq(
    "io.cucumber" %% "cucumber-scala" % Versions.cucumberScala % Test,
    "io.cucumber" % "cucumber-junit" % Versions.cucumberJUnit % Test
  )
}
