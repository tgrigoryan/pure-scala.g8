import sbt._

object Dependencies {
  lazy val catsVersion = "1.0.1"
  lazy val cats = Seq(
    "org.typelevel" %% "cats-core" % catsVersion)

  lazy val specs2Version = "3.9.5"
  lazy val specs2 = Seq(
    "org.specs2" %% "specs2-junit",
    "org.specs2" %% "specs2-core",
    "org.specs2" %% "specs2-mock",
    "org.specs2" %% "specs2-scalacheck",
  ).map(_ % specs2Version)
}
