package abstract_.noabs;

public class MainClass {

    public static void main(String[] args) {
	// 2가지의 문제점 체크 :
	// 1. 팝업스토어 : 정식 매장이 존재하는데, 팝업스토어 객체를 여전히 생성 가능
	PopupStore ps = new PopupStore();
	
	// 2. 팝업스토어 클래스 내부에서 오버라이딩이 필수인 메서드가 누락될 수도 있음 ex: 포도주스
	PopupStore grape = new Store();
	grape.orderApple();
	grape.orderOrange();
	grape.orderGrape(); // 포도 주스의 가격이 누락됨

    }

}
