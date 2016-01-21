name := """Base-Business-Details-Service"""

version := "1.0"

scalaVersion := "2.11.7"


resolvers += "spray repo" at "http://repo.spray.io"

val sprayVersion = "1.3.3"


// Change this to another test framework if you prefer
libraryDependencies ++= Seq(
     //AKKA
     "com.typesafe.akka" %% "akka-actor" % "2.3.6",
     //Spray IO
     "io.spray" %% "spray-routing" % sprayVersion,
     "io.spray" %% "spray-client" % sprayVersion,
     "io.spray" %% "spray-testkit" % sprayVersion % "test",
     //JSON
     "org.json4s" %% "json4s-native" % "3.2.10",
     //Logging
     "com.typesafe.scala-logging" %% "scala-logging-slf4j" % "2.1.2",
     "ch.qos.logback" % "logback-classic" % "1.1.2",
     //Test
    "org.scalatest" %% "scalatest" % "2.2.4" % "test",
     //Mockito
     "org.mockito" % "mockito-all" % "1.9.5" % "test"
    )

// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.11"


//val stage = taskKey[Unit]("Stage Task")
//
//val Stage = config("stage")
//
//stage := {
//  (packageWar in Compile).value
//  (update in stage).value.allFiles.foreach{ f =>
//    if (f.getName.matches("webapp-runner-[0-9]\\.]+.jar")) {
//      println("copying " + f.getName)
//      IO.copyFile(f, baseDirectory.value / "target" / "webapp-runner.jar")
//    }
//  }
//
//}

//fork in run := true