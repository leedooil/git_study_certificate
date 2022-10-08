#include<stdio.h>
//구조체 배열
struct insa{
	int bun;
	char name[20];
};

main() {
	struct insa a = { 1,"aaa" };
	printf("bun=%d\n", a.bun);
	printf("name=%s\n", a.name);

	struct insa var[] = {1,"aaa",2,"bbb",3,"ccc"};
		printf("bun\tname\n");
	for (int i = 0; i < 3; i++) {
		printf("%d\t%s\n", var[i].bun,var[i].name);
	}
	
}