package projectA01;

public class StringHello {

	public static void main(String[] args) {
		System.out.println("test"+10+10); // 첫자가 문자이면 나머지도 문자로 인식
		System.out.println(10+10+"test"); // 첫자가 숫자이면 그 뒤를 숫자로 인식하지만 문자가 있으면 문자로 인식
		System.out.println(10+"test"+10); // 숫자 + 문자 + 숫자
	}

}
