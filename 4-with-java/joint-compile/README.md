joint compilation
===


```bash
$ groovyc -j ./bu src/App.groovy src/Duck.java src/Chester.groovy -d target/
```

```bash
$ cd target && java -cp ".:/$GROOVY_HOME/lib/*" App
```