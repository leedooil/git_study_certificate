# 세트 : 기호 -> {} -> set()
# 중복불가, 순서가 없음

set = {'Hello', 2022, '대전', 100}
print(set)

# print(set[0]) set는 순서가 없어서 인뎅싱 불

# 포함되어있는지 검사, 있으면 True 없으면 False
bool = 'Hello' in set
print(bool)

# 추가
set.add('World')
print(set)

# 삭제
set.remove(100)
print(set)

# 업데이트
set.update('Korea') # 글자단위로 set에 추가된걸 확인할수있징
set.update ([10])   # set에다가 [10]이라는 리스트를 추가해줘라
print(set)
