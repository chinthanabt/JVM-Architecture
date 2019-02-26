class Test  {
	static int x = 10;
	static{
		System.out.println(x); // direct read
		m1();
	}
	public static void m1(){
		System.out.println(x); // indirect read
	}
	
	public static void main(String[] args){}
}























/*
	inside a static block if we are trying to read
	a variable that is called direct read
*/


/*
	we are calling to a method inside static block and
	inside that method if we are trying to read a 
	variable that is called indirect read
*/

