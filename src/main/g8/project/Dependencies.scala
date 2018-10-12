import sbt._

object Dependencies {
  lazy val catsVersion = "1.4.0"
  lazy val catsEffectVersion = "1.0.0"
  lazy val cats = Seq(
    "org.typelevel" %% "cats-core"    % catsVersion,
    "org.typelevel" %% "cats-effect"  % catsEffectVersion
  )


  lazy val specs2Version = "4.3.4"
  lazy val specs2 = Seq(
    "org.specs2" %% "specs2-junit",
    "org.specs2" %% "specs2-core",
    "org.specs2" %% "specs2-mock",
    "org.specs2" %% "specs2-scalacheck",
  ).map(_ % specs2Version)
}
