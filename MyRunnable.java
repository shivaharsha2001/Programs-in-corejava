class MyRunnable implements Runnable {
	
	@Override
	public void run(){
		System.out.println("run is executed");
	}

	public static void main(String[] args) {

		MyRunnable mr = new MyRunnable();
		//mr.start();

		Thread th1 = new Thread(mr);
		th1.start();

		System.out.println("main is executed");
	}
}