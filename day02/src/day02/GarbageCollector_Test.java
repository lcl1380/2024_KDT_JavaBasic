package day02;

public class GarbageCollector_Test {
		
		public int objectNum; //객체 번호
		public GarbageCollector_Test(int number) {
			objectNum = number;
			System.out.println(objectNum + "번 객체 생성");
		}
		
		// 소멸자 : 자바에서는 일반적으로 사용하지 않음, 객체가 힙에서 삭제되기 직전 실행
		@Override
		protected void finalize() throws Throwable {
			System.out.println(objectNum + "객체가 힙에서 삭제됩니다.");
		}
}
