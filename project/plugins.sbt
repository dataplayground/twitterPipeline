resolvers += "Typesafe repository" at "https://repo.typesafe.com/typesafe/releases/"
// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.4.4")

// frontend plugins --> thy duplicated?
addSbtPlugin("com.typesafe.sbt" % "sbt-uglify" % "1.0.3")
addSbtPlugin("com.typesafe.sbt" % "sbt-digest" % "1.1.0")
addSbtPlugin("com.typesafe.sbt" % "sbt-gzip" % "1.0.0")
