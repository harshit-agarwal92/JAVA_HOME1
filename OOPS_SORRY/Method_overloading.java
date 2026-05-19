package OOPS_SORRY;

public class Method_overloading {
	public static void m1(int a) {
		System.out.println(a);
	}
	public static void m1(double d) {
		System.out.println(d);
	}
	public static void main(String[] args) {
		m1(10);
		m1('a');
	}

}
