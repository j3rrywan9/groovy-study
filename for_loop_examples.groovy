def store = ''
for (String s in 'a'..'c') store += s
println store

def myString = 'Groovy iterator'
store = ''
for (s in myString) {
	store += s
}
println store == myString
