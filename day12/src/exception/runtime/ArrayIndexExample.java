package exception.runtime;

public class ArrayIndexExample {
    public static void main(String[] args) {
	int[] arr = {3, 6, 9};
	
	// 존재하지 않는 인덱스 번호 조회하기 : 문법상 오류는 탐지되지 않음
	System.out.println(arr[3]);
    }
}
