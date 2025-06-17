import sbt._

object Dependencies {
  object version {
    val scalaTestPlus = "3.2.19.1"
    val jackson = "2.19.1"
  }

  lazy val munit = "org.scalameta" %% "munit" % "0.7.29"

  val jacksonDatabind =
    "com.fasterxml.jackson.core" % "jackson-databind" % version.jackson
  val jacksonModuleScala =
    "com.fasterxml.jackson.module" %% "jackson-module-scala" % version.jackson

  val scalaTestPlus =
    "org.scalatestplus" %% "scalacheck-1-18" % version.scalaTestPlus
}
