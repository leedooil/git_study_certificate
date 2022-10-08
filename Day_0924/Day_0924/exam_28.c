#include<stdio.h>
// 함수 포인터
int sum(int, int); //함수 원형
int sub(int, int); //함수 원형

main() {
	// 함수 포인터 선언
	int (*pf)(int, int);
	pf = sum;

	int result = pf(10, 20);
	printf("%d\n", result);

	pf = sub;
	result = pf(30, 10);
	printf("%d\n", result);
}

int sum(int a, int b) {
	return a + b;
}

int sub(int a, int b) {
	return a - b;
}
