#include<stdio.h>

main() {
	char val[20] = "KOREA";
	char str[20] = "SEOUL";

	char* ptr1 = val;
	char* ptr2 = str;

	printf("val = %s\n", ptr1);
	printf("str = %s\n", ptr2);
	
	printf("%s\n", ptr1 + 2); // REA
	printf("%c\n", *ptr1); // K
	printf("%c\n", *(ptr2 + 2)); // O
	printf("%c\n", *ptr2 + 2); // S + 2 = U

	
}