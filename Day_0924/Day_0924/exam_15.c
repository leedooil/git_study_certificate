#include<stdio.h>

main() {
	int ary[3]; // ary[0]	ary[1]	ary[2]
	int s = 0;
	int i;
	*(ary + 0) = 1; // ary[0] = 1
	ary[1] = *(ary + 0) + 2; // ary[1] = 3
	ary[2] = *ary + 3; // ary[2] = 4
														
	for (i = 0; i < 3; i++) {
		s = s + ary[i];
	}
	printf("%d", s);
}