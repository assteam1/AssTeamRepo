package pack1;

public class C {
	
	int a=20;
	int b=30;
	int c=50;
	public void add() {
		System.out.println(a+b);
	}
	public void mul() {
		System.out.println(a*b*c);
	}
	public void m8() {
		System.out.println("push");
	}
	public void m9() {
		System.out.println("i am sathish");
	}
	public static void main(String[] args) {
		C a=new C();
		a.add();
		a.mul();
	}

}
