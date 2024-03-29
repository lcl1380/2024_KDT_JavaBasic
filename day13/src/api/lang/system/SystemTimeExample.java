package api.lang.system;

public class SystemTimeExample {

	public static void main(String[] args) {
		/**
		 * - currentTimeMillis()와 nanoTime() 메서드는 UNIX 시간이라는 체계를 사용함
		 * 
		 * - UNIX 시간이란 1970년 1월 1일 00시 00분 00초를 기점으로
		 *   얼만큼의 시간이 지났는지 숫자로 표현하는 체계
		 *   
		 * - 현재까지의 시간을 1000분의 1초로 변환한 에폭시간과 현재까지의 시간을 10억분의 1초로 변환한 에폭시간을 long 타입으로 리턴합니다.
		 **/
		long start = System.currentTimeMillis(); // 메서드의 리턴타입이 long
		System.out.println("시작시간 : " + start);
		long sum = 0;
		
		// 단위 구분을 위해 _로 표시해도 ㄱㅊ음
		for(long i = 1; i < 10_000_000_000L; i++) {
			sum += i;
		}
		
		long end = System.currentTimeMillis();
		System.out.println("종료시간 : " + end);
		System.out.println("계산에 소요된 시간 : " + (end - start));

	}

}