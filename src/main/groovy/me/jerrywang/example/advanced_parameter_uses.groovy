class Summer {
	// Explicit arguments and default value
	def sumWithDefaults(a, b, c=0) {
		return a + b +c
	}

	// Defines arguments as list
	def sumWithList(List args) {
		return args.inject(0){sum, i -> sum += i}
	}

	// Optional arguments as array
	def sumWithOptionals(a, b, Object[] optionals) {
		return a + b + sumWithList(optionals.toList())
	}

	// Defines arguments as map
	def sumNamed(Map args) {
		['a', 'b', 'c'].each{args.get(it, 0)}
		return args.a + args.b + args.c
	}
}

def summer = new Summer()

println summer.sumWithDefaults(1, 1)

println summer.sumWithList([1, 1, 1])

println summer.sumWithOptionals(1, 1, 1)

println summer.sumNamed(a:1, b:1)

println summer.sumNamed(a:1, b:1, c:1)

println summer.sumNamed(c:1)

