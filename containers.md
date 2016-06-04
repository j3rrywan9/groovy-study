# Containers

## List

## Map

### Specifying maps

Simple maps are specified with square brackets around a sequence of items, delimited with commas.
The key feature of maps is that the items are key-value pairs that are delimited by colons:
```groovy
[key1: value1, key2: value2, key3: value3]
```

THe character sequence `[:]` declares an empty map.

For the common case of having keys of type `String`, you can leave out the string markers (single or double quotes) in a
map declaration:
```groovy
assert ['a': 1] == [a: 1]
```

The `keySet` method returns a `set` of keys, a collection that's flat like a list but has no duplicate entries and no
inherent ordering.

The `value` method returns the list of values.