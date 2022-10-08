#include<stdio.h>
struct score {
	char name[20];
	int os, db, hap, hhap;
};

main() {
	struct score s[3] = { {"aa",95,88},{"bb",84,92},{"cc",86,75} };

	struct score* p;
	p = &s[0];

	(p + 1)->hap = (p + 1)->os + (p + 2)->db; // 84 + 75 = 159
	(p + 1)->hhap = (p + 1)->hap + p->os + p->db; // 159 + 95 + 88 = 342

	printf("%d", (p + 1)->hap + (p + 1)->hhap); // 159 + 342 = 501
}