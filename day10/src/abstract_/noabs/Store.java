package abstract_.noabs;

public class Store extends PopupStore {
    
    @Override
    public void orderApple() {
	System.out.println("착즙 사과주스를 팝니다. 가격은 20000원 입니다.");
    }
    
    @Override
    public void orderOrange() {
	System.out.println("착즙 오렌지주스를 팝니다. 가격은 24000원 입니다.");
    }

    /** 실수로 포도주스의 가격을 누락함 : 오버라이딩 되지 않은 것에 대한 알람을 받고 싶음 **/
//    @Override
//    public void orderGrape() {
//	System.out.println("착즙 포도주스를 팝니다. 가격은 28000원 입니다.");
//    }
}
