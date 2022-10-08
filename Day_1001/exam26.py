# 클래스와 객체

'''
    번호, 이름, 국어, 영어, 수학
    총점, 평균 구하여 출력
'''

class Student:

    def setData(self, b, n, k, e, m):
        self.b = b  # 멤버 변수(클래스에 소속된 변수)
        self.n = n
        self.k = k
        self.e = e
        self.m = m

    def sum(self):
        self.tot = self.k + self.e + self.m # self붙으면 자동으로 멤버변수 됨
        return self.tot

# 객체 생성
stu = Student()
stu.setData(1,'aaa',90,80,90)
print('번호 = ', stu.b)
    
result = stu.sum()
print('총점 = ', result)
print('self.sum = ',stu.tot)
