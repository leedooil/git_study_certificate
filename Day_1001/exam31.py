# 상속

class AA:
    def __init__(self, bun, name):
        self.bun = bun
        self.name = name

    def aPrint(self):
        print('bun = ', self.bun)
        print('name = ', self.name)

    def exam(self):
        print('AA Class')
        for x in range(6):
            print(x, end = '\t')
        print()

class Sub_AA(AA):
    def __init__(self, bun, name):
        super().__init__ (bun,name)
    
    def test(self):
        print('Sub_AA Class')
        for x in range(5):
            print(x, end = '\t')
        print()
    

aa = AA(1,'aaa')
aa.aPrint()
aa.exam()
print('-----------------------------')

sub_bb = Sub_AA(5,'bbb')
sub_bb.aPrint()
sub_bb.exam()
sub_bb.test()
