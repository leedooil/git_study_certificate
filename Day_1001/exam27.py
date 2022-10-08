# 클래스와 객체

class Exam:
    def set(self, x, y):
        self.a = x
        self.b = y

    def add(self):
        result = self.a * self.b
        return result

a = Exam()
a.set(4,5)
print(a.add())
