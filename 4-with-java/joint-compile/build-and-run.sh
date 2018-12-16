#!/bin/bash
rm -rf target/*

groovyc -j src/App.groovy src/Duck.java src/Chester.groovy -d target/
# groovyc -cp target/app.jar -j src/* -d target/

{
  cd target && java -cp ".:/$GROOVY_HOME/lib/*" App
}