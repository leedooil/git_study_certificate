#include<stdio.h>
void exam(int val[], int n) {
	int i, j, temp;
	for (i = 0; i < n - 1; i++) { // 5-1
		for (j = i + 1; j < n; j++) { // 5
			if (val[i] < val[j]) { // ��������
				temp = val[i];
				val[i] = val[j];
				val[j] = temp;
			}
		}
	}
}

main() {
	int a[] = { 5,3,7,2,6 };
	int n = sizeof(a) / sizeof(a[0]); // ����� : 5 (�迭�� ũ�� ���)
	exam(a,n);
	for (int i = 0; i < 5; i++) {
		printf("%3d",a[i]);
	}
}