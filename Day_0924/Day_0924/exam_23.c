#include<stdio.h>
// 2차원 배열
main() {
	int arr[2][3] = { {1,2,3},{4,5,6} };
	for (int i = 0; i < 2; i++) {
		for (int j = 0; j < 3; j++) {
			printf("%3d", arr[i][j]);
		}
		printf("\n");
	}
	printf("---------------------------\n");

	int arr2[][3] = { {1},{2,3},{4,5,6,} };
	int row = sizeof(arr2) / sizeof(arr2[0]);
	for (int i = 0; i < row; i++) {
		for (int j = 0; j < 3; j++) {
			printf("%3d",arr2[i][j]);
		}
		printf("\n");
	}
	
	printf("---------------------------\n");
	int arr3[2][3] = { 1,2,3,4 };
	for (int i = 0; i < 2; i++) {
		for (int j = 0; j < 3; j++) {
			printf("%3d", arr3[i][j]);
		}
		printf("\n");
	}

	printf("---------------------------\n");
	char str[3][20] = { "Korea","Daejeon","Seoul" };
	for (int i = 0; i < 3; i++) {
			printf("%s\n",str[i]);
		}
	}
