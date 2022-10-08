# 클래스와 객체

class Car:
    name = ''   # 클래스 변수

    def exam(self):
        a = 10
        print('Car 클래스 exam() 호출')
        print('name = ', self.name)
        print('a = ',a)

c1 = Car()
c1.name = 'aaa'
c1.exam()
        
