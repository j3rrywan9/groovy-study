#!/usr/bin/env groovy

class Pretender {
	// Hook method methodMissing()
	def methodMissing(String name, Object args) {
		"called $name with $args"
	}
}

def bounce = new Pretender()
assert bounce.hello('world') == 'called hello with [world]'

class PropPretender {
	// Hook method propertyMissing()
	def propertyMissing(String name) {
		"accessed $name"
	}
}

bounce = new PropPretender()
assert bounce.hello == 'accessed hello'
