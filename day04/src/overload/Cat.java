package overload;

public class Cat {
		public String name;
		public String kind;
		
		public Cat() {
			name = "아무냥";
			kind = "코리안 숏헤어";
		}
		
		public Cat(String name, String kind) {
			this.name = name;
			this.kind = kind;
			System.out.println("지금부터 이 아이의 이름은 " + this.name + "입니다.");
			System.out.println(this.name + "의 품종은 " + this.kind + " 입니다.");
		}
		
		public void call_Cat() {
			System.out.println("야옹아 이리와");
		}
		
		public void call_Cat(String name) {
			String callCat = name;
			System.out.println(callCat + "야 이리와");
		}
		
}
