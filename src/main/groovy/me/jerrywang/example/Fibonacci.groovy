package me.jerrywang.example

current = 1
next = 1
10.times {
    print current + ' '
    newCurrent = next
    next = next + current
    current = newCurrent
}
print ''

