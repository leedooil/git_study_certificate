#include<stdio.h>

main() {
	int a = 100; // a�� �ּ� 0x50����
	int b = 200; // b�� �ּ� 0x100����
	int* ptr;
	ptr = &a;

	printf("a=%p\n",&a); // 0x50����
	printf("b=%p\n",&b); // 0x100����
	printf("ptr=%p\n",ptr); // 0x50����
	printf("ptr=%d\n",*ptr); // 50�� �ּ� ��°� : 100
	printf("ptr=%d\n",*ptr+1); // 50�� �ּ� ��°� + 1 : 101 
	printf("ptr=%d\n",*(ptr+1)); // (50 + 1)�� �ּ� ��°� : �̻��� �� ����
}
