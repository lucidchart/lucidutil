name := "lucidutil"

organization := "com.lucidchart"

version := "1.23.0-SNAPSHOT"

scalaVersion := "2.10.1"

libraryDependencies ++= Seq(
	"org.scala-lang" % "scala-actors" % "2.10.1",
 	"org.specs2" %% "specs2" % "1.14" % "test",
	"ch.qos.logback" % "logback-classic" % "1.0.1"
)

resolvers ++= List(
	DefaultMavenRepository,
	"Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/",
	"Staging Sonatype repository" at "https://oss.sonatype.org/content/groups/staging/"
)
