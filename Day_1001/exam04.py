# Data Type

'''
    1) 단일값 저장 : integer, float, string, boolean, Complex(복소수)
    
    2) 다중 값 저장 : list[], tuple(), dictionary{}, set{}
'''

# 문자열 인덱싱[0], 슬라이싱[1:5]

str = 'Hello World!' # index : [0] ~ [11] /  [-1] ~ [-12]
print('str = ', str)
print("str[0] = ", str[0])
print("str[-12] = ", str[-12])
# str[0] = '\'

# 슬라이싱

print('str[:] = ', str[:])      # 전체
print('str[6:] = ', str[6:])    # 6 ~ 끝
print('str[2:5] = ', str[2:6])  # 2 ~ 6전까지
print('str[0:] = ', str[0:])    # 처음부터 5전까지
print('str[::2] = ', str[::2])  # 전체를 2씩 증가하면서


