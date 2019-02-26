class Test extends Thread{
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println("child thread  : "+i);
			try{
				Thread.sleep(1000);
			} catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args)throws InterruptedException {
		Test t = new Test();
		t.setDaemon(true);
		t.start();
		for(int i=1;i<=10;i++){
			System.out.println("parent thread : "+i);
			try{
				Thread.sleep(100);
			} catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}
}





