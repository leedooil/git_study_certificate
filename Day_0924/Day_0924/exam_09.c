#include<stdio.h>
// 포인터(주소)
// 포인터변수 : 주소를 기억하는 변수
main() {
	int a = 10;
	int* pt; // 포인터 변수 선언

	// 밑에 처럼하면 안댐
	// pt = 10;
	// pt = a;

	pt = &a; // a라는 변수가 가리키고 있는 주소를 주소연산자 &사용해서 선언
	printf("%p\n", &a);
	printf("%p\n", pt);

	printf("a=%d\n", a);
	printf("a=%d\n", *pt); // pt -> 주소, *pt -> 주소 값

	a = 15; // 직접 참조
	printf("a=%d\n", a);
	printf("a=%d\n", *pt); // pt -> 주소, *pt -> 주소 값

	*pt = 30; // 간접 참조
	printf("a=%d\n", a);
	printf("a=%d\n", *pt); // pt -> 주소, *pt -> 주소 값


}
