package projectA01;

public class projectA0108 {

	public static void main(String[] args) {
		 int inc = 10;
		 int inb = ++inc;
		 System.out.println("inc="+inc+"inb="+inb);
		 inb = inc++;
		 System.out.println("inc="+inc+"inb="+inb);
		 
		 int ind = 10;
		 int ind1 = --ind;
		 System.out.println("ind1="+ind1+"ind="+ind);
		 ind1 = ind--;
		 System.out.println("ind1="+ind1+"ind="+ind);

		 inc = 10;
		 inb = ++inc;
		 System.out.println("inc="+inc+"inb="+inb);
		 inb = inc++;
		 System.out.println("inc="+inc+"inb="+inb);
		 
		 ind = 10;
		 ind1 = ind--;
		 System.out.println("ind1="+ind1+"ind="+ind);
		 ind1 = --ind;
		 System.out.println("ind1="+ind1+"ind="+ind);

	}

}
