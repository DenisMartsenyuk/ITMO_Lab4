#!/bin/bash

#compile
javac -sourcepath ./src -d bin src/Main.java

#run
java -classpath bin Main

