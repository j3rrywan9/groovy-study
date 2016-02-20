#!/usr/bin/env groovy

MetaClass mc = String.metaClass
final Object[] NO_ARGS = []

println mc.properties.size()

println mc.methods.size()

println mc.metaMethods.size()
