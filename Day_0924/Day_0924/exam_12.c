#include<stdio.h>
void exam(int* a, int* b) {
	// a = 100번지, b = 200번지
	int t = *a;
	*a = *b;
	*b = t;
}
main() {
	int a = 10;	// 주소 100
	int	b = 20; // 주소 200
	printf("a=%d	b=%d\n", a, b);

	exam(&a, &b); //주소(참조)에 의한 호출
	printf("a=%d	b=%d\n", a, b);
}