package equals.array;

import java.util.Arrays;

public class ArrayEqualsTest {

	public static void main(String[] args) {
		// 배열은 참조형 변수이기 때문에, 단순 대입시 문제가 발생함
		int[] intArray1 = {1,2,3,4,5};
		System.out.println("배열 1의 주소 : " + intArray1);
		
		// 배열도 참조형 변수이므로, 주소가 아닌 실제 자료를 조회하려면
		// Arrays.toString(배열자료) 형식으로 호출해야 한다.
		System.out.println("배열 1의 값 : " + Arrays.toString(intArray1));
		
		// 새로 생성하지 않고, intArray1을 대입받는 intArray2
		// 힙에 저장된 자료를 새로 똑같이 할당하는 복사를 깊은 복사라고 함.
		// 변수 뒤에 .clone() 을 써서 수행함 : 파이썬의 경우 .copy()
		int [] intArray2 = intArray1;
		
		intArray1[0] = 100;
		System.out.println("배열 1의 값(인덱스0을 100으로 수정함) : " + Arrays.toString(intArray1));
		
		System.out.println("\n배열 2의 주소 : " + intArray2);
		System.out.println("배열 2의 값 : " + Arrays.toString(intArray2));
		System.out.println("배열 1, 2 간의 동등성 비교(얕은 복사) : " + (intArray1==intArray2));
		
		
		// intArray1의 내용들을 intArray2에 복사 진행 .clone()
		intArray2 = intArray1.clone();
		System.out.println("\n복사 수행 후 배열 2의 값 : " + Arrays.toString(intArray2));
		
		// 깊은 복사 이후에는 intArray1의 값을 변경해도 intArray2의 값은 변하지 않는다.
		intArray1[1] = 200;
		
		System.out.println("배열 1, 2 간의 동등성 비교(깊은 복사) : " + (intArray1==intArray2));
	}

}
