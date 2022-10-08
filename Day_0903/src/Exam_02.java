public class Exam_02 {

	public static void main(String[] args) {
		int arr[] = {7,5,9,6,4};
		method(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		int s = test(1,2);
		System.out.println(s);
		s = test(1,2,3);
		System.out.println(s);
		s = test(1,2,3,4,5);
		System.out.println(s);
		s = test(1,2,3,4,5,6,7,8,9,10);
		System.out.println(s);
	}
	
	static void method(int a[]) {
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					int temp=a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	// �������� �Ű����� 2��¥�� test�� ȣ��
	static int test(int n, int m) {
		return n+m;
	}
	
	// �������� �迭�� �ν��� �Ű����� ������� test ȣ��
	static int test(int ... n) {
		int s = 0;
		for (int i = 0; i < n.length; i++) {
			s+=n[i];
		}
		return s;
	}

}
