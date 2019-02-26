class Test extends Thread {
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println("child thread");
			try{
				Thread.sleep(1000);
			} catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args)throws InterruptedException {
		Test t = new Test();
		t.start();
		for(int i=1;i<=10;i++){
			System.out.println("parent thread");
			try{
				Thread.sleep(1000);
			} catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}
}





