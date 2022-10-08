#include<stdio.h>
main() {
	char str[3][20] = { "Korea", "Daejeon", "Seoul" };
	for (int i = 0; i < 3; i++) {
		printf("%s\n", str[i]);
	}

	for (int i = 0; i < 20; i++) {
		printf("%3c", str[0][i]);
	}
}