package projectA01;

import java.util.Scanner;

public class projectA0116 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 표준 입력
		// 컴퓨터로 데이터를 전달하고자 할때는 입력, 출력 뿐
		// 출력은 System.out
		// scanner는 표준 입력으로 들어오는 값을 편하게 사용할 수 있게 만드는 클래스(mapping 감싼다)
		// 자바에서 모든것이 클래스는 아님.. 완전한 객체 지향 언어는 아님!
		
		System.out.print("점수를 입력하시오");
		int score = scanner.nextInt();
		if(score >= 80) {
			System.out.println("축하합니다. 합격입니다.");
		} else if((score <= 80)&&(score >= 70)) {
			System.out.println("다시 도전하세요.");
		} else if((score <= 70)&&(score >= 60)) {
			System.out.println("다시 시도하세요.");
		} else {
			System.out.println("이따 도전하세요.");
		}
		scanner.close(); // 사용했으면 닫아줘야함
	}

}
