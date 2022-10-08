# 함수

def sum(*a):    # 가변인자
    s = 0
    for x in a:
        s += x
    return s

print('sum = ', sum(1,2,3,4,5))

result = sum(10,20,30)
print('sum = ', result)
