#include<stdio.h>
struct person {
	int bun;
	char name[20];
	int score;
};
main() {
	struct person a[] = { {1,"aaa",90},{2,"bbb",88},{3,"ccc",95} };
	int s = 0;
	for (int i = 0; i < 3; i++) {
		s += a[i].score;
	}
	printf("%d\n",s); // 출력값 : 273
	// 구조체 포인터
	struct person* p;
	p = a;
	printf("bun=%d\n", a[0].bun);
	printf("bun=%d\n", p->bun);
	p++;
	printf("bun=%d\n", a[1].bun);
	printf("bun=%d\n", p->bun);

	printf("bun=%d\n", a[2].bun);
	printf("bun=%d\n", (p+1)->bun);
}