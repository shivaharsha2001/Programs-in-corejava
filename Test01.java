class Test01 {
	public static void main(String[] args) 	{
		System.out.println("main start");
		
		Thread th1 = new Thread();  //just thread object is created
		th1.start();				//thread of execution is started

		System.out.println("Thread object is created");
		System.out.println("Thread of execution is started for the thread th1");

		System.out.println("main end");
	}
}