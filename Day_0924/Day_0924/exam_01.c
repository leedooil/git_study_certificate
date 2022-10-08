#include<stdio.h>
//사용자정의 함수

int sum(int a, int b, int c);

main() {
	int max = sum(7, 5, 9);
	printf("%d\n",max);
	printf("%d\n",sum(7,5,9));
}

int sum(int a, int b, int c) {
	int max = a;
	if (max<b) {
		max = b;
	}
	if (max < c) {
		max = c;
	}
	return max;
	
}