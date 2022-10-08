# 튜플 : 기호 -> () -> tuple()
# 변경이 불가능한 리스트

# 튜플 생성
data = (10,20,30,40,50)

test = 'Seoul',2022,'대전',100

print(data)
print(test)

# 변경 시도
# data[0] = 100 튜플은 변경불가
print(data[0])  # 인덱싱
print(data[1:3])    # 슬라이싱

# 튜플 안에 또다른 튜플이 ?
a = ((1,2),(3,4),(5,6))
print(a[0]) # (1,2)
print(a[0][0])  # 1
