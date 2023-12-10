class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println("run executed");	
	}

	public static void main(String[] args) 	{

		MyThread mt = new MyThread(); //super(); -> Thread() -> initi
		mt.start();

		System.out.println("main executed");
	}
}
/*
		//1. custom thread of executed is started for my thread object
		//2. run() is called and loaded in this custom thread of executed
*/