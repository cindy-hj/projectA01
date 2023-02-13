package projectA01;
/*
 * 개발자 : SHJ
 * 기능 : 합을 계산하기
 */

public class HelloWorldP {

	public static int sum (int n, int m) {
		return n+m; // 합 결과
	}
	
	public static void main(String[] args) {
		
		int i = 20; // 20으로 초기화
		int s;
		char a;
		s = sum(i,10); // sum method 사용
		a = '?';
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
	
	}
	
}
