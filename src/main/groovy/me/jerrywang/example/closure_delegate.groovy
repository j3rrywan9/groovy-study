package me.jerrywang.example

class Post {
  int count
  def info() {
    "This is blog post #$count!"
  }
}

count = 0

def info() {
  "Count value is $count."
}

// Declare a closure called getInfo
def getInfo = {
  println "this is: " + this.class
  println "delegate is: " + delegate.class
  count++
  info()
}

println "Current resolveStrategy of getInfo: " + ['OWNER_FIRST', 'DELEGATE_FIRST'][getInfo.resolveStrategy]
// Call closure getInfo with default OWNER_FIRST resolveStrategy
println getInfo()

println "Setting resolveStrategy of getInfo to DELEGATE_FIRST..."
getInfo.resolveStrategy = Closure.DELEGATE_FIRST
println "Current resolveStrategy of getInfo: " + ['OWNER_FIRST', 'DELEGATE_FIRST'][getInfo.resolveStrategy]
getInfo.delegate = new Post(count: 100)
// Call closure getInfo with DELEGATE_FIRST resolveStrategy
println getInfo()
