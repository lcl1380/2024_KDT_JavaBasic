package this_;

public class Car_Main {

	public static void main(String[] args) {
		// 자동차 2대 생성
		Car myCar = new Car("제네시스 GV90");
		Car yourCar = new Car("테슬라");
		
		for(int i = 0; i<20; i++) {
			myCar.accel();
		} myCar.showStatus();
		
		yourCar.accel();
		yourCar.showStatus();
	}

}
