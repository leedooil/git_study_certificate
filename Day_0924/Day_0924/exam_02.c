#include<stdio.h>
void sum(int val);
int add(int val);

void main() {
	sum(5);// 결과값 10
	printf("%d\n",add(5)); //결과값 15
}

void sum(int val) {//5
	int s = 0, i;
	for (i = 1; i < val; i++) {
		s += i; //+1+2+3+4
	}

	printf("%d\n",s);
}

int add(int val) {
	int s = 0;
	for (int i = 1; i <= val; i++) {
		s += i; //+1+2+3+4+5
	}
	return s;
}