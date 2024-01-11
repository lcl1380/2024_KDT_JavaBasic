package day03;

public class Cat {
		// 이름, 나이, 품종, 털 색깔
		public String name;
		public int age;
		public String kind;
		public String color;
		
		// 클래스 정의용 클래스파일 내부 메서드는 Static을 붙이지 않음
		public void show_Cat_Info() {
			System.out.println("고양이의 이름 : " + name);
			System.out.println("고양이의 나이 : "  + age);
			System.out.println("고양이의 품종 :"  + kind);
			System.out.println("고양이의 색상 :" + color);
		}
}
