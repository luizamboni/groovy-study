joint compilation
===

Compile files with `-j` optionß
```bash
$ groovyc -j src/App.groovy src/Duck.java src/Chester.groovy -d target/
```

Inspect how these classes are compileds and see how groovyc compile each file
```bash
$ javap src/App.class
$ javap src/Duck.class
$ javap src/Chester.class
```

Run, passing classpath of Groovy lib (the files .class generetad require this)
```bash
$ cd target && java -cp ".:/$GROOVY_HOME/lib/*" App
```