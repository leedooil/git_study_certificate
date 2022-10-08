#include<stdio.h>
// 포인터 배열(주소를 저장할 수 있는 배열)
main() {
	int a = 10, b = 20, c = 30;
	int* pt[3] = { &a, &b, &c };
	for (int i = 0; i < 3; i++) {
		printf("%p\t", pt[i]);
	}

	printf("\n");
	for (int i = 0; i < 3; i++) {
		printf("%3d", *pt[i]); //포인터 배열
	}

	printf("\n");
	printf("a=%d\n", **pt);  // 이중 포인터 *(*(pt+0)))

	for (int i = 0; i < 3; i++) {
		printf("%3d", *(*(pt+i)));
	}

}
