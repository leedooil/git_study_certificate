#include<stdio.h>
// �Լ� ������
int sum(int, int); //�Լ� ����
int sub(int, int); //�Լ� ����

main() {
	// �Լ� ������ ����
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
