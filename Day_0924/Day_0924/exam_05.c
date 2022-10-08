#include<stdio.h>
int res10() {
	return 4;
}

int res30() {
	return 30 + res10();
}

int res100() {
	return 200 + res30();
}

void main() {
	int result = res100();
	printf("%d",result); // °á°ú°ª : 234
}
