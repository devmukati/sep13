package testing;
public class constructors  {
	public constructors() {
		this (10);
	System.out.println("i am con");
	
	}
	public constructors(int i) {
		// TODO Auto-generated constructor stub
	System.out.println("it is this");
	}
	

		public static void main(String[] args) throws CloneNotSupportedException {
			constructors co=new constructors();
			co.clone();
			
		}
}	


