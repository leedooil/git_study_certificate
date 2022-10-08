#include<stdio.h>
int res(int n) {
	int t;
	if(n < 1)
		return 2;
	else {
		t = (2 * res(n - 1)) + 1;
		printf("%3d", t);
		return t;
	}

}

void main() {
	res(5);
}
