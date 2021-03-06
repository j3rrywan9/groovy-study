#!/usr/bin/env groovy

class Marshal {
	static String marshal(Integer self) {
		self.toString()
	}

	static Integer unMarshal(String self) {
		self.toInteger()
	}
}

use(Marshal) {
	println 1.marshal()
	println "1".unMarshal() == 1
	[Integer.MIN_VALUE, -1, 0, Integer.MAX_VALUE].each {
		assert it.marshal().unMarshal() == it
	}
}
