# 반복문(while, for)

a = [10,20,30,40,50,60,70]

cnt = len(a)   # 7
sum = 0

for i in range(cnt):
    print(a[i],end = '\t')
    sum += a[i]
print()
print('sum = ', sum)

print('---------------------------------------------')
sum = 0
for x in a:
    print(x, end = '\t')
    sum += x
print()    
print('sum = ', sum)    
