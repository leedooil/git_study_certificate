#include<stdio.h>
void exam(int a, int b) {
	int t = a;
	a = b;
	b = t;

	// a = 20, b = 10
}

main() { // ���� ���� ȣ��
	int a = 10, b = 20;
	exam(a, b);
	printf("a=%d	b=%d", a, b);

	// ���⼭�� �ȹٲ� a = 10, b = 20
}
