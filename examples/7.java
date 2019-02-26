class ChildThread extends Thread {
	static Thread parentThread;
	public  void run(){
		try{parentThread.join();}catch(InterruptedException e){}
		for(int i=1;i<=10;i++){
			System.out.println("child thread : "+i);
		}
	}
}
class Test{
	public static void main(String[] args)throws InterruptedException{
		ChildThread.parentThread = Thread.currentThread();
		ChildThread ct = new ChildThread();
		ct.start();
		ct.join();
		for(int i=1;i<=10;i++){
			System.out.println("main thread : "+i);
		}
	}
}



