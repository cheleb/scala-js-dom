import sbt._
import sbt.Keys._
import scalafix.sbt.BuildInfo.scalafixVersion

object Dependencies {

  object Ver {
    val scala211 = "2.11.12"
    val scala212 = "2.12.15"
    val scala213 = "2.13.16"
    val scala3   = "3.3.5"
  }

  object Dep {
    val scalafixCore = Def.setting("ch.epfl.scala" %% "scalafix-core" % scalafixVersion cross CrossVersion.for3Use2_13)
  }
}
