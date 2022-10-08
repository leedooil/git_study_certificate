# 클래스와 객체
# 클래스 변수

class Person:
    nation = 'Korea'    # 클래스 변수

    def setData(self, bun, name, score):
        self.bun = bun
        self.name = name
        self.score = score

    def personPrint(self):
        print('NAT\tBUN\tNAME\tSCORE')
        print('%s\t%d\t%s\t%d' %(self.nation, self.bun, self.name, self.score))


print('nation = ',Person.nation)

# 객체 생성
p = Person()
p.nation = 'ccc'
p.bun = 5
p.name =  'ddddddd'
p.score = 99
p.personPrint()


p2 = Person()
p2.setData(1,'bbb',30)
p2.personPrint()
