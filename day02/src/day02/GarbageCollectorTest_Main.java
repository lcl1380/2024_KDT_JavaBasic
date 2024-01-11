package day02;

public class GarbageCollectorTest_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GarbageCollector_Test test2 = null;
		
		for (int i=0; i<5; i++) {
			GarbageCollector_Test test = new GarbageCollector_Test(i);
			
			if (i == 3) {
				test2 = test; //3번 객체는 test2와 연결 유지
			}
			test = null;
			
		}
		//쓰레기 수집 강제 실행 명령어(실제로 쓸 필요는 없음)
		System.gc();
	}

}
