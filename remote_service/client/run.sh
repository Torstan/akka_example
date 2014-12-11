#!/bin/bash

AKKA_LIB_PATH="/usr/local/akka-2.1.4/lib/akka/"

java -cp \
 .:/usr/local/scala-2.10.4/lib/scala-library.jar:/usr/local/scala-2.10.4/lib/akka-actors.jar:/usr/local/scala-2.10.4/lib/typesafe-config.jar:${AKKA_LIB_PATH}/akka-remote_2.10-2.1.4.jar:${AKKA_LIB_PATH}/protobuf-java-2.4.1.jar:${AKKA_LIB_PATH}/netty-3.5.8.Final.jar \
 client.HelloLocal
