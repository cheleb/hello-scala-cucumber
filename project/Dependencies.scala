import sbt._

object Dependencies {
  object Versions {
    val cucumberJUnit = "7.18.1"
    val cucumberScala = "8.23.1"
    val zio = "2.1.1"
  }
  val zio = Seq("dev.zio" %% "zio" % Versions.zio)
  val munit = Seq("org.scalameta" %% "munit" % "0.7.29" % Test)
  val cucumber = Seq(
    "io.cucumber" %% "cucumber-scala" % Versions.cucumberScala % Test,
    "io.cucumber" % "cucumber-junit" % Versions.cucumberJUnit % Test
  )
}
