package encapsulation;

public class B {
	public static int bx =99;
	
	public String by = "yellow";
	
public static void main(String[] args) {
		
		
		B objB = new B();
		
		B.b1();
		objB.b2();
		System.out.println(B.bx);
		System.out.println(objB.by);

	}
	
	
	public static void b1() {
		System.out.println("b1");
	}
	
	public void b2() {
		System.out.println("b2");
	}

}
