#include<stdio.h>
//구조체 : 사용자 정의 자료형. 자바의 클래스랑 비슷
struct Student { // 내가 만든 유니크한 자료형
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
