#include<stdio.h>
void exam(int* a, int* b) {
	// a = 100����, b = 200����
	int t = *a;
	*a = *b;
	*b = t;
}
main() {
	int a = 10;	// �ּ� 100
	int	b = 20; // �ּ� 200
	printf("a=%d	b=%d\n", a, b);

	exam(&a, &b); //�ּ�(����)�� ���� ȣ��
	printf("a=%d	b=%d\n", a, b);
}