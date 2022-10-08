#include<stdio.h>
int exam(int* p) {
	int i, s = 0;
	for (i = 0; i < 5; i++) {
		s = s + *(p + i);
		//s = s + *p + i;
	}
	return s;
}

main() {
	int a[] = { 1,3,5,2,4 };
	int result = exam(a);
	printf("%d", result); // Ãâ·Â°ª : 15
}
