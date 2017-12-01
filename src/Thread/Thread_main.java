package Thread;

public class Thread_main {

	public static void main(String[] args) {
		Thread_run [] thr1 = new Thread_run[3];
		Thread_runnable [] thr2 = new Thread_runnable[3]; 
		
		for(int i = 0; i < 1; i++) {
			thr2[i]  = new Thread_runnable();
			thr2[i].run();
			thr1[i]  = new Thread_run();
			thr1[i].start();
		
			try {
				thr1[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println("main‚©‚ço—Í :"+i);
		}
	}

}
