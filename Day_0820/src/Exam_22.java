
public class Exam_22 {

	public static void main(String[] args) {
		// ∆Ú±’¿Ã 90 ~ 100 -> A
		// ∆Ú±’¿Ã 80 ~ 89 -> B
		// ∆Ú±’¿Ã 70 ~ 79 -> C
		// ∆Ú±’¿Ã 60 ~ 69 -> D
		// ∆Ú±’¿Ã 0 ~ 59 -> F
		
		int avg = 59;
		char grade;
		if(avg>=90) {
			grade='A';
		}else if(avg>=80){
			grade='B';
		}else if(avg>=70){
			grade='C';
		}else if(avg>=60){
			grade='D';
		}else {
			grade='F';
		}
		
		System.out.println("∆Ú±’ "+avg+"¿∫ "+grade+"µÓ±ﬁ¿‘¥œ¥Ÿ.");
		
		
	}

}
