#include<stdio.h>
// Àç±ÍÇÔ¼ö
int func(int n) {
	if (n == 1)
		return 1;
	else
		return n + func(n - 1); // 5+4+3+2+1
}

main() {
	int result = func(5);
	printf("%d", result);
}
