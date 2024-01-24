package example.thread4;

public class Thread_NOT_Safety2 extends Thread {
	
	static int share;
	
	public static void main(String[] args) {
		Thread_NOT_Safety2 t1 = new Thread_NOT_Safety2();
		Thread_NOT_Safety2 t2 = new Thread_NOT_Safety2();
		
		t1.start();
		t2.start();
	}
	
	// 스레드 안전을 위해서 사용하는 메서드 : synchronized
	public synchronized static void sharePlus() {
		System.out.println(share++);
	}
	
	@Override
	public void run() {
		for(int count=0; count <10; count++) {
			sharePlus(); // 동시성 제어가 되는 메서드로 1씩 증가함
			try { Thread.sleep(1);}
			catch(Exception e) {}
		}
	}
}
