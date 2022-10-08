#include<stdio.h>
int ep(int base, int exp);

void main() {
	int res;
	res = ep(2,10);
	printf("%d\n",res);
}

int ep(int base, int exp) {
	int res = 1;
	int i;
	for (i = 0; i < exp; i++) {
		res *= base; // res = res * base
	}
	return res;
}