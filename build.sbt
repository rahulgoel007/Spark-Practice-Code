name := "sparkCode"

version := "0.1"

scalaVersion := "2.12.7"

// https://mvnrepository.com/artifact/org.apache.spark/spark-core
libraryDependencies ++= Seq("org.apache.spark" % "spark-core_2.12" % "2.4.4", "org.apache.spark" % "spark-sql_2.12" % "2.4.4")
