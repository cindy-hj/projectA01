package projectA01;

import java.util.Scanner;

public class projectA0111 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("국어와 영어 점수를 입력하세요");
		
		int score1 = scanner.nextInt();
		int score2 = scanner.nextInt();
		
		int sum = score1 + score2;
		int avg = sum/2;
		System.out.println("score1= "+score1);
		System.out.println("score2= "+score2);
		System.out.println("sum= "+sum);
		System.out.println("avg= "+avg);

	}

}
