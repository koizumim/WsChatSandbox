// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

// Use the Play sbt plugin for Play projects
addSbtPlugin("play" % "sbt-plugin" % "2.1.0")

// Use IDEA plugin for IntelliJ IDEA development
addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.4.0")