#include<stdio.h>

main() {
	int a = 100; // a의 주소 0x50번지
	int b = 200; // b의 주소 0x100번지
	int* ptr;
	ptr = &a;

	printf("a=%p\n",&a); // 0x50번지
	printf("b=%p\n",&b); // 0x100번지
	printf("ptr=%p\n",ptr); // 0x50번지
	printf("ptr=%d\n",*ptr); // 50번 주소 출력값 : 100
	printf("ptr=%d\n",*ptr+1); // 50번 주소 출력값 + 1 : 101 
	printf("ptr=%d\n",*(ptr+1)); // (50 + 1)번 주소 출력값 : 이상한 값 나옴
}
