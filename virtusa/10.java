class Test  {
	static int x = 10;
	static{
		m1();
		System.out.println("first static block");
	}
	public static void main(String[] args){
		m1();
		System.out.println("main method");
	}
	public static void m1(){
		System.out.println(y);
	}
	static{
		System.out.println("second static block");
	}
	static int y = 20;
}





