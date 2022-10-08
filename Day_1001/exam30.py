# 클래스와 객체
class Sawon:

    def __init__(self, bun, name, age):
        self.bun = bun
        self.name = name
        self.age = age
            
    def saPrint(self):
        print('bun = ', self.bun)
        print('name = ', self.name)
        print('age = ', self.age)
'''
sa = Sawon()
sa.bun = 1
sa.name = 'aaa'
sa.age = 30
sa.saPrint()
print('------------------------')
'''
sa2 = Sawon(5,'bbbb',28)
sa2.saPrint()
