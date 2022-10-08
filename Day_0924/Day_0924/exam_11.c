#include<stdio.h>
void exam(int a, int b) {
	int t = a;
	a = b;
	b = t;

	// a = 20, b = 10
}

main() { // 값에 의한 호출
	int a = 10, b = 20;
	exam(a, b);
	printf("a=%d	b=%d", a, b);

	// 여기서는 안바뀜 a = 10, b = 20
}
