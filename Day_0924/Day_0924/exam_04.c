#include<stdio.h>
void sum(int a[]) {
	int s = 0;
	int i;
	for (i = 0; i < 5; i++) {
		s += a[i];
	}
	printf("%d\n",s); // 결과값 : 15
}
void main() {
	int a[] = { 1,2,3,4,5 };
	// a : 0번 요소의 주소
	// a[0] : 0번 요소의 값
	sum(a); // 주소를 이용한 함수 호출
}