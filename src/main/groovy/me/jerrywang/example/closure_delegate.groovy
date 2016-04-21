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

def getInfo = {
    println this.getClass()
    println delegate.getClass()
    count++
    info()
}

println getInfo()

getInfo.resolveStrategy = Closure.DELEGATE_FIRST
getInfo.delegate = new Post(count: 100)

println getInfo()
