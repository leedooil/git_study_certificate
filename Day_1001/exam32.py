# 상속

class Super:
    def __init__(self,bun):
        self.bun = bun
    def sPrint(self):
        print('Supper bun : ', self.bun)
    def sum(self, n):
        s = 0
        for x in range(n):
            s += x
        print('sum = ', s)

class Child(Super):
    def __init__(self,bun):
        super().__init__(bun)

    def total(self):
        print('Child test')

    def sum(self, n):
        s = 0
        for x in range(n):
            s *= x
        print('Child sum = ', s)

child = Child(1)
child.sPrint()
child.sum(5)
child.total()

    
