#include<stdio.h>
// 2�� ������ : int **pointer
// �迭������ : int (*pointer)[2] : 2���� �迭 ������ �� ���
// �����͹迭 : int *pointer[2]

main() {
	int arr[3][2] = { {11,22},{33,44},{55,66} };
	//				  arr[0]   arr[1]  arr[2] : 1�����̶�� �����ϸ�
	//	    *ptr = *(ptr+0)   *(ptr+1) *(ptr+2) 
	//	  **ptr = *(*(ptr+0)) : 11
	//	  *(*(ptr+1)+0) : 33
	//	  *(*(ptr+2)+0) : 55
	int(*ptr)[2] = arr;
	printf("%d\n",*(ptr[0]+0)); //11
	printf("%d\n",*(ptr[0]+1)); //22
	printf("%d\n",*(ptr[1]+0)); //33
	printf("%d\n",*(ptr[1]+1)); //44
	printf("%d\n",*(ptr[2]+0)); //55
	printf("%d\n",*(ptr[2]+1)); //66

	//printf("%d\n", **ptr); //11
	//printf("%d\n", *(*(ptr+0))); //11
	//printf("%d\n", *(*(ptr+0)+0)); //11
	//printf("%d\n", *(*(ptr+0)+1)); //22
	//printf("%d\n", *(*(ptr+1)+0)); //33
	//printf("%d\n", *(*(ptr+1)+1)); //44
	//printf("%d\n", *(*(ptr+2)+0)); //55
	//printf("%d\n", *(*(ptr+2)+1)); //66
}