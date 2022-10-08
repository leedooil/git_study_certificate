# 함수

# 반환타입 X, 매개변수 X
def add():
    print('add() call')

# 반환타입 X, 매개변수 O
def sum(x, y):
    s = x + y
    print('s = ', s)
    
# 반환타입 O, 매개변수 O
def tot(n, m):
    s = 0
    for i in range(n, m+1):
        s += i
    return s

# 함수 호출

add()
sum(10,20)
print(tot(1,10))
result = tot(1,10)
print('result = ', result)
