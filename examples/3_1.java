class Test {
	public static void main(String[] args) {
		doSomething();
	}
	public static void doSomething(){
		doSomethingMore();
	}
	public static void doSomethingMore(){
		doSomething();
	}
}



