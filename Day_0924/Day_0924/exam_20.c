#include<stdio.h>
// 문자열과 포인터
main() {
	char ch[] = { 'a','b','c','d','e','\0'}; // '\0'은 문자열의 끝을 의미하는 기호
	char* str = "abcde";

	printf("ch = %s\n", ch);
	printf("str = %s\n", str);
	for (int i = 0; i < 5; i++) { // 문자열도 배열임
		printf("%3c", *(str+i));
	}
}