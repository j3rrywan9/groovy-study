# Closure

## Introduction

Closures are objects of which the main purpose in life is their behavior.

A *closure* is a piece of code wrapped up as an object.
It acts like a method in that it can take parameters and return a value.
It's normal object in that you can pass a reference to it just as you can to any other object.

If the closure needs to take only a single parameter to work on, Groovy provides a default name `it` so that you don't
need to declare it specifically.

Two particular areas that benefit from closures:
* Performing everyday tasks with collections
* Using resources in a safe manner

In general terms, such a mechanism uses a *callback* to execute the work.
Closures are Groovy's way of providing transparent callback targets as first class citizens.

Closures allow the *controlling* logic (the iteration) to be separated from the code to execute for every element.

## Declaring closures

When there's only one parameter passed into the closure, its declaration is optional.
The magic variable `it` can be used instead.

Multiple parameters can be declared in sequence,

A second way of declaring a closure is to directly assign it to a variable:
```groovy
def printer = { line -> println line }
```
**TIP** Whenever you see the braces of a closure, think: `new Closure() {}`.

## Using closures

Suppose you have a reference `x` pointing to a closure; you can call it with `x.call()` or simply `x()`.
Any arguments to the closure call go between the parentheses.

The class `groovy.lang.Closure` is an ordinary class, albeit one with extraordinary power and extra language support.
It has a number of methods available beyond `call`.

## Understanding closure scope

The closure somehow remembers the context of its birth and carries it along throughout its lifetime.

Inside a closure, you could legitimately assume `this` would refer to the current object, which is the closure object
itself.

The programmer can control how references are resolved.
While you cannot directly set `this` to a different value, you can set a so-called `delegate`, which will be used when
resolving free variables.
Per default, the `delegate` refers to the `owner`.
