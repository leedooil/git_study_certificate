#include<stdio.h>
// ������ �迭(�ּҸ� ������ �� �ִ� �迭)
main() {
	int a = 10, b = 20, c = 30;
	int* pt[3] = { &a, &b, &c };
	for (int i = 0; i < 3; i++) {
		printf("%p\t", pt[i]);
	}

	printf("\n");
	for (int i = 0; i < 3; i++) {
		printf("%3d", *pt[i]); //������ �迭
	}

	printf("\n");
	printf("a=%d\n", **pt);  // ���� ������ *(*(pt+0)))

	for (int i = 0; i < 3; i++) {
		printf("%3d", *(*(pt+i)));
	}

}
