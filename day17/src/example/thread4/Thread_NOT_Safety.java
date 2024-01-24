package example.thread4;

public class Thread_NOT_Safety extends Thread {
	static int share;
	
	public static void main(String[] args) {
		Thread_NOT_Safety t1 = new Thread_NOT_Safety();
		Thread_NOT_Safety t2 = new Thread_NOT_Safety();
		
		t1.start();
		t2.start();
	}
	
	// 레이스 컨디션이 발생함 : 둘 이상의 스레드가 하나의 공용 자원에 접근
	public void run() {
		for(int count=0; count <10; count++) {
			System.out.println(share++); // 이게머드라? 아 ~
			
			try { Thread.sleep(4000);}
			catch(Exception e) {}
		}
	}
}
