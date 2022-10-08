#include<stdio.h>

main() {
	int a[] = { 10,20,30,40,50 };
	int* ptr = a; // 배열은 그 자체가 주소값이기 때문에 주소연산자& 안써도됨
	//int* ptr = &a[0];
	printf("배열 인덱스 출력\n");
	for (int i = 0; i < 5; i++) {
		printf("%5d", a[i]);
	}
	printf("\n배열을 포인터처럼 출력\n");
	for (int i = 0; i < 5; i++) {
		printf("%5d", *(a+i));
	}

	printf("\n포인터를 이용한 출력\n");
	for (int i = 0; i < 5; i++) {
		printf("%5d", *(ptr + i));
	}

}