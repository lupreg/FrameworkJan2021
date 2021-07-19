package encapsulation;

public class A {
	public static int ax =10;
			
	public String ay = "yellow";

	public static void main(String[] args) {
		
		
		A objA = new A();
		
		a1();
		objA.a2();
		System.out.println(ax);
		System.out.println(objA.ay);

	}
	
	public static void a1() {
		System.out.println("a1");
	}
	
	public void a2() {
		System.out.println("a2");
	}

	
	
	
	

}
