# 리스트 형 : 기호 -> []

# 비어있는 리스트 생성
aList = list()      # 또는 aList = []
print(aList)        # 리스트 전체
print(len(aList))   # 리스트 길이

# 리스트에 데이터 추가
aList.append(10)
aList.append(20)
print(aList)        # 리스트 전체
print(len(aList))   # 리스트 길이

# 5개의 요소를 갖는 리스트 생성
bList = [10,20,30,40,50] # index : [0] ~ [4]
print(bList[0:3])   # 0번째 부터 3번째 전까지

bList[1] = 'aaa'    # 인덱싱 방식
print(bList[0:3])   # 슬라이싱 방식


a = [0,10,20,30,40,50,60,70,80,90]
print(a[::2])   # 배열을 2씩 증가시킴

list = [10,20,30,'Korea',40,50]
print(list)
print(list[0])
print(list[3])
print(list[0:3])
print(list[3][0])
print(list[3][0:3])


