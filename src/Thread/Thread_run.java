package Thread;

public class Thread_run extends Thread {
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("�X���b�h" + getName() + "����o��:" +  i);
		}
		try {
			sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}