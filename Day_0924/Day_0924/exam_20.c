#include<stdio.h>
// ���ڿ��� ������
main() {
	char ch[] = { 'a','b','c','d','e','\0'}; // '\0'�� ���ڿ��� ���� �ǹ��ϴ� ��ȣ
	char* str = "abcde";

	printf("ch = %s\n", ch);
	printf("str = %s\n", str);
	for (int i = 0; i < 5; i++) { // ���ڿ��� �迭��
		printf("%3c", *(str+i));
	}
}