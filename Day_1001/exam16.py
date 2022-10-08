# 반복문(while, for)

data = [90,80,75,87,95,70,77]   # 리스트

data[0] + data[1]
i = 0   # index용
s = 0   # 합계
print(data)     #전체출력
print((len(data)))

while i < len(data):    # 7
    print(data[i], end = '\t')
    s += data[i]
    i += 1
print()    
print('s = ',s)    
