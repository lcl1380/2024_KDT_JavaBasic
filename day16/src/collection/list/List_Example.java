package collection.list;

import java.util.ArrayList;
import java.util.List;

// 임포트해야 사용 가능

public class List_Example {
	public static void main(String[] args) {
		// ArrayList와 LinkedList는 사용방식은 전부 List 인터페이스를 따른다
		// 따라서 교환이 가능함 : 인터페이스가 같은 구현체들을 사용법이 모두 똑같음
		// 제네릭 : 타입 안정화를 위해 객체 내부에 저장되는 타입을 일치시키는 방법
		
		// String만 저장할 수 있는 컬렉션
		List<String> list = new ArrayList<>(); // Java 1.8 버전부터는 생성자에 제네릭 표시 X
//		List<String> list = new ArrayList<String>(); // 원래는 이렇게 써야 했음
		
		String str1 = "Java";
		String str2 = "SpringBoot";
		
		// 컬렉션들은 toString()이 자동으로 오버라이딩 되어
		// 주소값이 아닌 내부 저장 요소가 바로 console에 찍힘
		System.out.println(list);
		
		// list에 객체를 저장하는 메서드 add() : 데이터를 마지막 지점에 추가
		list.add(str1);
		list.add(str2);
		
		list.add("infra");
		list.add("Docker");
		list.add("Linux");
		list.add("Linux"); // 중복 저장 허용
		System.out.println(list);
		
		// list에 저장된 총 객체 수 얻기 : .size()
		int size = list.size();
		System.out.println("list에 저장된 총 객체의 수 : " + size);
		
		// list에 객체 삽입 add(index, 객체) : 데이터를 해당 인덱스 번호에 넣고 
		// 해당 인덱스 이후 자료는 전부 한 칸씩 뒤로 밀어내기
		list.add(2, "Network");
		System.out.println(list);
		
		int size_2 = list.size();
		System.out.println("list에 저장된 총 객체의 수 : " + size_2);
		
		// list 데이터 수정 set(index, 객체)
		// list[3] = "ubuntu"; // 일반 인덱싱으로 수정하는 방법 사용 불가
		list.set(5, "ubuntu");
		
		System.out.println(list);
		int size_3 = list.size();
		System.out.println("list에 저장된 총 객체의 수 : " + size_3);
		
		// list 내부객체 가져오기 get(index)
		String s = list.get(2);
		System.out.println(s);
		
		// list 내부에 저장된 객체의 번호가 몇번인지 확인하기
		int idx = list.indexOf("Docker"); // 없는 자료 조회 시 -1을 반환함
		System.out.println(idx); // 0부터 시작함
		
		// list에서 객체데이터 삭제 remove(index), remove(객체)
		list.remove(5);
		System.out.println(list);
		
		list.remove(str1); // Str1 = Java
		System.out.println(list);
		
		// list 내부에 저장된 객체의 유무 확인 contains() : 있으면 true, 없으면 false
		System.out.println(list.contains(str1));
		
		// list의 반복문 처리 : 인덱스로 조회
		for(int i=0; i<list.size(); i++) {
			System.out.println("내부요소 : " + list.get(i));
		}
		
		System.out.println("-----------------------");
		
		// 향상된 for문도 사용 가능(List<String> 으로 선언했으므로 String으로 받기
		for(String str : list) {
			System.out.println("내부요소 : " + str);
		}
		
		// list 내부의 전체 자료 삭제 clear()
		list.clear();
		System.out.println(list); // list 변수의 빈 리스트는 남아있음
		
		// list 내부 데이터가 전부 비어있는지 확인하는 메서드 isEmpty()
		// 비어있다면 true, 아니라면 false 반환
		System.out.println(list.isEmpty());
	}
}
