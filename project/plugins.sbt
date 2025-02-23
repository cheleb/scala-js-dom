libraryDependencies += "org.scala-js" %% "scalajs-env-jsdom-nodejs" % "1.1.0"
libraryDependencies += "org.scala-js" %% "scalajs-env-selenium"     % "1.1.1"

addSbtPlugin("ch.epfl.scala" % "sbt-scalafix"        % "0.14.2")
addSbtPlugin("com.eed3si9n"  % "sbt-buildinfo"       % "0.13.1")
addSbtPlugin("com.github.sbt"  % "sbt-ci-release"      % "1.9.2")
addSbtPlugin("com.lihaoyi"   % "scalatex-sbt-plugin" % "0.4.1")
addSbtPlugin("org.scala-js"  % "sbt-scalajs"         % "1.18.2")
addSbtPlugin("org.scalameta" % "sbt-scalafmt"        % "2.5.4")
