public class Exam_24 {

	public static void main(String[] args) {
		AAB aab = new AB();
		System.out.println(aab.func(5));
		
		System.out.println();
		
		AAB aabb = new AAB(); 
		System.out.println(aabb.func(5));
		
		System.out.println();
		
		AB abc = new AB();
		System.out.println(abc.func(5));
	}

}

class AAB{
	int func(int num) {
		if (num==1) {
			return 1;
		}
		return num + func(num-1);
	}
}

class AB extends AAB{
	int func(int num) {
		if (num==1) {
			return 1;
		}
		return num * func(num-1);
	}
}
