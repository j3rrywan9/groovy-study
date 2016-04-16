# Learning Groovy

## Compiling Groovy with groovyc
Groovy comes with a compiler called **groovyc**.

`groovyc -d classes Fibonacci.groovy`

## Running a compiled Groovy script with Java
Running a compiled Groovy program is identical to running a compiled Java program, with the added requirement of having the embedded groovy-all*.jar file in your JVM's classpath, which will ensure that all of Groovy's 3rd-party dependencies will be resolved automatically at runtime.

`java -cp /Users/jwang/.gvm/groovy/current/embeddable/groovy-all-2.4.4.jar:classes Fibonacci`

## Dynamic Programming and Meta Object Protocol (MOP)
Dynamic programming allows the introduction of a new state, or even more importantly, allows the addition of a new behavior or modification of an existing one.

Whenever Groovy calls a method, it doesn't call it directly but asks an intermediate layer to do so on its behalf. The intermediate layer provides hooks that allow you to influence its inner workings.

The MOP is the collection of rules of how a request for a method call is handled by the Groovy runtime system and how to control the intermediate layer. The format of the protocol is defined by the respective APIs.

When writing Groovy source code, the Groovy compiler generates bytecode that calls into the MOP.

### Customizing methodMissing
Whenever a method cannot be found in the target object, the MOP looks for the hook method
```groovy
Object methodMissing(String name, Object arguments)
```
and invokes it with the requested method name and arguments.

### Customizing propertyMissing

### Customizing GroovyObject methods
All classes that are compiled by Groovy implement the **GroovyObject** interface, which looks like this:
```groovy
public interface GroovyObject {
	Object invokeMethod(String methodName, Object args);
	Object getProperty(String propertyName);
	void setProperty(String propertyName, Object newValue);
	MetaClass getMetaClass();
	void setMetaClass(MetaClass metaClass);
}
```

### Modifying behavior through the metaclass
For every class A in the class loader, Groovy maintains a metaclass -- an object of type MetaClass.

## Category
Groovy adds a **use** method to **java.lang.Object** that takes two parameters: a category class (or any number thereof) and a closure:
```groovy
public Object use(Class categoryClass, Closure closure)

public Object use(Object[] array)

public Object use(List categoryClassList, Closure closure)
```
While the closure is executed, the MOP is modified as defined by the category. After the closure execution is finished, the MOP is reset to its old state.
