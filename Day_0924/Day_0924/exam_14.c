#include<stdio.h>

main() {
	int a[] = { 10,20,30,40,50 };
	int* ptr = a; // �迭�� �� ��ü�� �ּҰ��̱� ������ �ּҿ�����& �Ƚᵵ��
	//int* ptr = &a[0];
	printf("�迭 �ε��� ���\n");
	for (int i = 0; i < 5; i++) {
		printf("%5d", a[i]);
	}
	printf("\n�迭�� ������ó�� ���\n");
	for (int i = 0; i < 5; i++) {
		printf("%5d", *(a+i));
	}

	printf("\n�����͸� �̿��� ���\n");
	for (int i = 0; i < 5; i++) {
		printf("%5d", *(ptr + i));
	}

}