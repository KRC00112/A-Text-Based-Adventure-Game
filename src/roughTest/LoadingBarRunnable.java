package roughTest;

public class LoadingBarRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.print("Loading Bar: [");
		for(int i=0;i<50;i++) {
			
			
			System.out.print("\u25A0");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.print("]");
		System.out.println();

		System.out.println("done");

		
		
	}
	public static void main(String[] args) {
		
		
		LoadingBarRunnable runnable=new LoadingBarRunnable();
		Thread thread=new Thread(runnable);
		
		thread.start();
		
		
		
		
		
	}
	
	
	

}
