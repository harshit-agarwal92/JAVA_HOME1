package Method_Overiding;

public class main {
	public static void main(String[] args) {
		Parent p=new Parent();
		p.marry();
		child c=new child();
		c.marry();
		Parent p1=new child();
		p1.marry();
		
	}

}
