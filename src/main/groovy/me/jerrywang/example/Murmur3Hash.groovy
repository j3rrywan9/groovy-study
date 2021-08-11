package me.jerrywang.example

import com.google.common.base.Charsets
import com.google.common.hash.Hashing

String jenkinsUrl = "http://jenkins.example.com"

println Hashing.murmur3_32().newHasher().putString(jenkinsUrl, Charsets.UTF_8).hash().toString()
