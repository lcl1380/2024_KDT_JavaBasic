package example.thread;

public class MainThread {

	public static void main(String[] args) {
		// 보조 스레드 실행을 위해서는 먼저 Thread 객체를 생성해야 한다
		
		// 1. Runnable 구현체 생성
		Runnable trd = new MultiThread();
		
		// 2. Thread 클래스의 인스턴스를 생성 : 생성자 호출 시 Runnable 구현체를 parameter로 넘김
		Thread sTrd = new Thread(trd);
		
		System.out.println("보조 스레드 준비 완료 .");

		// 3 :; 보조스레드는 .start()로 호출 가능
		sTrd.start();
		System.out.println("먼저 끝나도 프로그램은 계속 돌아가는 메인 메서드 .");
	}

}
