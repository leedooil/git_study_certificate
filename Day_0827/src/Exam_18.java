import java.util.Scanner;

public class Exam_18 {

	public static void main(String[] args) {
		//������
		
//		for (int i = 2; i <= 9; i++) {
//			System.out.println("***" +  i + "�� ***");
//			for (int j = 1; j <=9 ; j++) {
//				System.out.println(i + "X" + j + " = " +(i*j));
//			}
//			System.out.println("*********");
//			System.out.println();
//		}
		
		for (int i = 2; i <= 9; i++) {
			System.out.print("["+i+"��]\t\t");
		}
			System.out.println();
			for (int i = 1; i <= 9; i++) {
				for (int j = 2; j <=9 ; j++) {
					System.out.print(j + "*" + i + "=" +(i*j)+"\t\t");
				}
//				System.out.print("\n");
				System.out.println();
		}
	}
}
