#include<stdio.h>
//����ü : ����� ���� �ڷ���. �ڹ��� Ŭ������ ���
struct Student { // ���� ���� ����ũ�� �ڷ���
	int bun;
	char name[20];
	int age;

};

main() {
	char n[20] = "aaaaaa";
	//n = "aaaaaaa";
	struct Student stu;
	stu.bun = 10;
	//stu.name = "aaaaa";
	strcpy(stu.name,"aaaaaa");
	stu.age = 28;

	printf("bum=%d\n",stu.bun);
	printf("name=%s\n",stu.name);
	printf("age=%d\n",stu.age);
}
