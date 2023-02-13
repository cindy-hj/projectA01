package projectA01;

public class projectA0114 {
	// anonymous method
	// static을 붙이면 메모리에 일정한 공간을 항상 할당해줌. 안써도 되면 안쓰는게 좋음
	// class 내부에 class 정의 가능
	{ 
		int x = 11;
	}
	
	public static void main(String[] args) {
		int x = 5;
		int x1 = 10;
		
		x = 10;
		System.out.println(x);
		{ // method 내에 class 정의 가능 -> system...주석 처리 해야함
			int x2 = 10;
			x1 = 11;
			System.out.println("내부+"+x1);
			x1 = 12;
		}
		System.out.println("외부+"+x1);
		
	}

}
