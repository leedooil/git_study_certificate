#include<stdio.h>
// ������(�ּ�)
// �����ͺ��� : �ּҸ� ����ϴ� ����
main() {
	int a = 10;
	int* pt; // ������ ���� ����

	// �ؿ� ó���ϸ� �ȴ�
	// pt = 10;
	// pt = a;

	pt = &a; // a��� ������ ����Ű�� �ִ� �ּҸ� �ּҿ����� &����ؼ� ����
	printf("%p\n", &a);
	printf("%p\n", pt);

	printf("a=%d\n", a);
	printf("a=%d\n", *pt); // pt -> �ּ�, *pt -> �ּ� ��

	a = 15; // ���� ����
	printf("a=%d\n", a);
	printf("a=%d\n", *pt); // pt -> �ּ�, *pt -> �ּ� ��

	*pt = 30; // ���� ����
	printf("a=%d\n", a);
	printf("a=%d\n", *pt); // pt -> �ּ�, *pt -> �ּ� ��


}
