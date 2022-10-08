# 함수

def add(n):
    s = 0
    for x in range(len(n)): # 0 + 1 + 2 + 3
        s += x
    return s

d = ['A',1, 2, 3]

def add2(n):
    s = 0
    for x in n:
        s += x
    return s
        
d = ['A',1, 2, 3]

dd = [1,2,3,4,5]

result = add2(dd)
print('result = ', result)
