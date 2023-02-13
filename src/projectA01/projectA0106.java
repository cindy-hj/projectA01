package projectA01;

public class projectA0106 {

	public static void main(String[] args) {
		char name1 = '신';
		char name2 = '현';
		char name3 = '정';
		System.out.println(name1+name2+name3);
		// 문자를 더하면 숫자가 된다
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);

		System.out.println(10+10+"안녕하세요");
		System.out.println("안녕하세요"+10+10);
		System.out.println("안녕하세요"+(10+10)); // 괄호안부터 계산해서 숫자로 인식
		// + 는 오버라이딩 기호, 한가지 기호가 여러가지 기능을 수행한다

		boolean b1 = (10>1);
		System.out.println(b1);
		
		String s1 = null;
//		int i1 = null; 오류 발생
	}

}
