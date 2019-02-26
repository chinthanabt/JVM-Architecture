class Test  {
	static Test t = new Test();
	{
		System.out.println("first instance block");
	}
	static{
		System.out.println("first static block");
	}
	Test(){
		System.out.println("no argument constructor");
	}
	public static void main(String[] args){
		Test t1 = new Test();
		System.out.println("main method");
		Test t2 = new Test();
	}
	static{
		System.out.println("second static block");
	}
	{
		System.out.println("second instance block");
	}	
}




