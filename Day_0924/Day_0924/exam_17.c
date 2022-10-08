#include<stdio.h>
void sort(int* a) {
	int i, j, temp;
	for (i = 0; i < 4; i++) {
		for (j = i + 1; j < 5; j++) {
			if (*(a + i) > *(a + j)) { // 오름차순
				temp = *(a + i);
				*(a + i) = *(a + j);
				*(a + j) = temp;
			}
		}
	}
}
void main() {
	int arr[] = { 7,4,9,3,6 };
	for (int i = 0; i < 5; i++) {
		printf("%3d", arr[i]);
	}
	sort(arr);
	printf("\n");
	for (int i = 0; i < 5; i++) {
		printf("%3d", *(arr+i));
	}
}