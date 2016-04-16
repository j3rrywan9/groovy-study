def roman = ['', 'I', 'II', 'III', 'IV', 'V', 'VI', 'VII']

assert roman[4] == 'IV'

roman[8] = 'VIII'

assert roman.size() == 9

myList = ['a', 'b', 'c', 'd', 'e', 'f']

assert myList[0..2] == ['a', 'b', 'c']

assert myList[0, 2, 4] == ['a', 'c', 'e']

myList[0..2] = ['x', 'y', 'z']
assert myList == ['x', 'y', 'z', 'd', 'e', 'f']

myList[3..5] = []
assert myList == ['x', 'y', 'z']

myList[1..1] = ['y', '1', '2']
assert myList == ['x', 'y', '1', '2', 'z']

