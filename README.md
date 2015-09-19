# Learning Groovy

## Compiling Groovy with groovyc
Groovy comes with a compiler called **groovyc**.

`groovyc -d classes Fibonacci.groovy`

## Running a compiled Groovy script with Java
Running a compiled Groovy program is identical to running a compiled Java program, with the added requirement of having the embedded groovy-all*.jar file in your JVM's classpath, which will ensure that all of Groovy's 3rd-party dependencies will be resolved automatically at runtime.

`java -cp /Users/jwang/.gvm/groovy/current/embeddable/groovy-all-2.4.4.jar:classes Fibonacci`

