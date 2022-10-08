# 사전형 : 기호 -> {} -> dict()

# 불변의 키, 가변의 값으로 구성

# 사전형 선언
data = {1:'aaa',2:'bbb',3:'ccc',4:'ddd'}
print(data)

str = {'a':100,'b':90,'c':88,'d':95,'a':88}
print(str)

# 항목추가
data[5] = 'eee'
print(data)

str['e'] = 97
print(str)

# 변경
data[1] = 'gggg'
print(data)

# 키에 해당하는 값을 출
print(data[2])
print(str['b'])

# 삭제
del data[1]
print(data)

del str['a']
print(str)
