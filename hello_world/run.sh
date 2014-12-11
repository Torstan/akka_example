#!/bin/bash


java -cp \
 .:/usr/local/scala-2.10.4/lib/scala-library.jar:/usr/local/scala-2.10.4/lib/akka-actors.jar:/usr/local/scala-2.10.4/lib/typesafe-config.jar\
  our.examples.HelloApp
