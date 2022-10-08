# 반복문(while, for)

s = 0
i = 0
while i < 10:
    i+=1    # i = i + 1 (i++)연산자는 Python에는 없당
    print(i)
    s += i
print("s = ",s)    

i = 0
s = 0
while True: # 0이외의 값
    i += 1
    print(i, end = '\t')
    s += i
    if i==10:
        break
print('s = ', s)    
    
        
