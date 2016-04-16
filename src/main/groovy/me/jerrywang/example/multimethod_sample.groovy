class MultiMethodSample {
    int mysteryMethod (String value) {
        return value.length()
    }

    int mysteryMethod (List list) {
        return list.size()
    }

    int mysteryMethod (int x, int y) {
        return x + y
    }
}

MultiMethodSample instance = new MultiMethodSample()

Closure multi = instance.&mysteryMethod

assert 10 == multi('String arg')
assert 3 == multi(['list', 'of', 'values'])
assert 14 == multi(6, 8)

