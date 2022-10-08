#include<stdio.h>
// 문자열 처리 함수
main() {
	char ch[20] = "KOREA";
	char str[20];
	// 문자열 길이
	printf("%d\n", strlen(ch));
	// 문자열 복사
	strcpy(str, ch); // ch -> str복사
	printf("str=%s\n", str);
	// 문자열 결합
	strcat(str,"LOVE");
	printf("str=%s\n", str);
}