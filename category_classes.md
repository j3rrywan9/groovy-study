# Category Classes

Groovy adds a `use` method to `java.lang.Object` that takes two parameters: a category class (or any number thereof) and
a closure:
```groovy
public Object use(Class categoryClass, Closure closure)

public Object use(Object[] array)

public Object use(List categoryClassList, Closure closure)
```

While the closure is executed, the MOP is modified as defined by the category.
After the closure execution is finished, the MOP is reset to its old state.

Category classes are by no means special.
Neither do they implement a certain interface nor do they inherit from a certain class.
They aren't configured or registered anywhere!
They just happen to contain static methods with at least one parameter.

When a class is used as an argument to the `use` method, it becomes a category class and every static method like
```groovy
static ReturnType methodName(Receiver self, optionalArgs) { ... }
```
becomes available on the receiver as if the `Receiver` had an instance method like
```groovy
ReturnType methodName(optionalArgs) { ... }
```
