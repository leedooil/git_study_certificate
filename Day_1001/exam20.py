# 반복문(while, for)

data = [[1,2,3],[4,5],[6,7,8,9]]
print(data[0])  # [1,2,3]
print(data[2][1]) # 7

for sub in data:
    for item in sub:
        print(item, end = '\t')
    print()

a = 100
result = 0

for i in range(1,3): # 1 ~ 2까지
    result = a >> i  # 100 / 2 = 50, 100 / 4 = 25
    result = result + 1 # 51, 26
print(result)    # 26
    
