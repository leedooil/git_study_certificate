#include<stdio.h>
main() {
	int a[2][2] = { {11,22},{44,55} };
	int i, j, s = 0;
	for (i = 0; i < 2; i++) {
		for (j = 0; j < 2; j++) {
			s += a[i][j]; // 11+22+44+55
		}
	}
	printf("s=%d", s);
	printf("\n--------------------\n");
	int* ptr = a; // int* ptr = a[0];
	int sum = 0;
	for (i = 0; i < 4; i++) {
		sum += *(ptr + i);
	}
	printf("sum=%d", sum);
	
}