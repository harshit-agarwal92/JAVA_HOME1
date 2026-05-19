package OOPS_SORRY;

public class trycatch {
	public static void main(String[] args) {
		System.out.println("hello");
		System.out.println("Evening");
		int[] a=new int[2];
		try {
			System.out.println(10/10);
			System.out.println(a[1]);
			String s=null;
			System.out.println(s.length());
		}
		catch(RuntimeException e) {
			System.out.println(10/5);
		}
//		catch(ArithmeticException e){
//			System.out.println(10/5);
//			
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println(10/5);
//		}
//		catch(NullPointerException e) {
//			System.out.println(10/5);
//		}
		
		System.out.println("Good");
	}

}
