#include<stdio.h>
// 1차원 배열과 포인터

main() {
	int arr[] = { 10,20,30,40,50 };
	printf("arr : %p\n", arr);
	printf("arr[0] : %p\n", &arr[0]);

	printf("arr : %d\n", *arr); // arr[0]
	printf("arr[0] : %d\n", *(arr+0)); // arr[0]
	printf("arr[1] : %d\n", *(arr+1)); // arr[1]
	printf("arr[2] : %d\n", *(arr+2)); // arr[2]
}