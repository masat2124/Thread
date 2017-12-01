package Thread;

public class Thread_runnable implements Runnable {
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("スレッド2から出力:" + i);
		}
	}
}