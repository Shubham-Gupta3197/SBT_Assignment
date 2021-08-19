name := "SBT_Assignment_Group4"

version := "0.1"

scalaVersion := "2.13.6"



lazy val common = project.in(file("common"))

  .settings(

    libraryDependencies += "org.scalactic" %% "scalactic" % "2.2.0-M1",
    libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.3.0-SNAPSHOT",
    libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.2" % "Test",
    libraryDependencies +="org.mockito" %% "mockito-scala" % "1.16.37" % "Test",






  )
lazy val rest = project.in(file("rest"))
  .settings(
    libraryDependencies += "com.typesafe.akka" %% "akka-http-spray-json" %   "10.2.6",
    libraryDependencies += "com.typesafe.akka" %% "akka-stream" % "2.6.15",
    libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.6.15",
    libraryDependencies += "org.json4s" %% "json4s-native" % "3.2.4",
    libraryDependencies +="com.typesafe.akka" %% "akka-stream-testkit" % "2.6.15"% "Test",
    libraryDependencies +=  "com.typesafe.akka" %% "akka-http-testkit" %"10.2.6"%"Test",
    libraryDependencies += "com.typesafe.akka" %% "akka-testkit" % "2.6.15"% "Test")
lazy val root = project.in(file(".")).aggregate(common, rest)

