name := "sbt-dependency-resolution"

version := "0.1"

scalaVersion := "2.11.12"

val kafkaClients = "org.apache.kafka" % "kafka-clients" % "1.0.0"
val embeddedKafka = "io.github.embeddedkafka" %% "embedded-kafka" % "2.3.0"

libraryDependencies ++= Seq(
  kafkaClients,
  embeddedKafka % Test
)
