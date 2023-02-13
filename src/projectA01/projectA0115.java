package projectA01;
// static int gx1=11; 의미 없음. 자바는 class로 되어있으므로 class 내부에 코드가 작성되야함.
// class 외부의 코드는 인식을 못함. 인식하게 하고 싶으면 {}로 정의를 해줘야 한다.
class A{ // class 안붙이면 method라서 의미가 없음
	static int gx1=11;	
}

public class projectA0115 {
	static int gx = 10; // 전역
	
	{
		int gx1 = 10; // 지역
	}
	
	public static void main(String[] args) {
		int x = 10;
		{
			int y = 20;
			{
				int z = 30;
				System.out.println(z);
			}
			System.out.println(y);
		}
		System.out.println(x);
		System.out.println(gx);
	}
}
