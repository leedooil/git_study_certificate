#include<stdio.h>
// ���ڿ� ó�� �Լ�
main() {
	char ch[20] = "KOREA";
	char str[20];
	// ���ڿ� ����
	printf("%d\n", strlen(ch));
	// ���ڿ� ����
	strcpy(str, ch); // ch -> str����
	printf("str=%s\n", str);
	// ���ڿ� ����
	strcat(str,"LOVE");
	printf("str=%s\n", str);
}