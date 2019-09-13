package testing;

public class clas{
	
	public clas() {
		this(10);
		System.out.println("class name");
		
	}
	public clas(int i) {
	System.out.println("class ");
	}
	public void clas(int a) {
		System.out.println(a);
	}
	public static void main(String[] args) {
	clas c=new clas();
	clas cl=new clas(10);
	}
	
}