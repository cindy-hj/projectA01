package projectA01;

public class projectA0103 {

	public static void main(String[] args) {
		int sum = 10+20;
		int value = 10;
		
		int value1 = value+sum;
		System.out.println(value1);
		
		long sum1 = (long)(10L+10L+10L+10L+2147483647L); // L은 롱형으로 값을 가진다는 뜻
		long sum2 = (long)(10+10+10+10+2147483647); // 10은 int 값(long형 아님), 2147483647는 int의 최대값이므로 overflow발생 
		long sum3 = (long)(10+10+10+10+10+2147483647);
		long sum4 = (long)(2147483647+10+10L+10+10+10);
		
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);
		
	}

}
