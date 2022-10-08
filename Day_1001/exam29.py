# 클래스와 객체
class Arr:
    a = ['Aaaa','Bbbb','Cccc','Dddd','Eeee','Ffff']

print(Arr.a)    
str = ''
for i in Arr.a:
    str = str + i
print(str)

str01 = ''
for i in Arr.a:
    str01 = str01 + i[0]
print(str01)    
