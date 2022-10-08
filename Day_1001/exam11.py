# 사전형 : 기호 -> {} -> dict()
list_data = ['a','b','c','d']
dict_data = {'a':90, 'b':95}

print(list_data[0])     # a
print(dict_data['a'])   # 90

# keys() : key를 모아둔 list반환
# values() : 값 모아서 list반환
# get(키) : 키에 해당하는 값을 반환

test = {'a':90,'b':88,'c':85,'d':95,'e':87}

key_list = test.keys()
print(key_list)

key_values = test.values()
print(key_values)

print(test.get('a'))
print(test['a'])
