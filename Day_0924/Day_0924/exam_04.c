#include<stdio.h>
void sum(int a[]) {
	int s = 0;
	int i;
	for (i = 0; i < 5; i++) {
		s += a[i];
	}
	printf("%d\n",s); // ����� : 15
}
void main() {
	int a[] = { 1,2,3,4,5 };
	// a : 0�� ����� �ּ�
	// a[0] : 0�� ����� ��
	sum(a); // �ּҸ� �̿��� �Լ� ȣ��
}