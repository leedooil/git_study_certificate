# 제어문
a = 9
b = 7
c = 8
if a < b:
    imsi = a
    a = b
    b = imsi
if a < c:
    imsi = a
    a = c
    c = imsi
if b < c:
    imsi = b
    b = c
    c = imsi

print(a,b,c)    
