

class MyRunnable implements Runnable {

	@Override
	public void run() {
		//task #2:
		for(int i=20; i>=1; i--){
			System.out.println("run: "+ i);
		}
	}
}

class Test05_Assignment{
	public static void main(String[] args) {
		
		MyRunnable mr = new MyRunnable(); 
		Thread th = new Thread(mr); //Bike
		th.start(); //Thread.run(); -> mr.run() -> O/P
		
		//task #1
		for(int i=1; i<=20; i++){
			System.out.println("main: "+ i);
		}
	}
}
