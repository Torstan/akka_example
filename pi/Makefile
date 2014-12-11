SRC_DIR := src
SRC := $(shell find ${SRC_DIR} -name "*.scala")
DIR=akka

TARGET := HelloRemote.jar

SCALAC := scalac 
SCFLAGS := /usr/local/scala-2.10.4/lib/akka-actors.jar  

.PHONY: all clean

all: ${TARGET}

${TARGET}: ${SRC}
	${SCALAC} -cp ${SCFLAGS} $^
	
clean:
	${RM} -r ${TARGET} ${DIR}
