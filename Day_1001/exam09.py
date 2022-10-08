# 세트 : 기호 -> {} -> set()
a = {'한국', '중국', '일본'}
print('1 : ',a)

a.add('베트남')
a.add('중국')
print('2 : ',a)

a.remove('일본')
print('3 : ',a)

a.update(['홍콩'],['한국'],['태국'])
print('4 : ',a)
