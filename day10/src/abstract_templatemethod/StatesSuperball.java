package abstract_templatemethod;

public class StatesSuperball extends Lottery {

    @Override
    public void buyLottary() {System.out.println("한 게임에 천원짜리 로또를 삽니다.");}

    @Override
    public void checkWinLottary() {System.out.println("45C6의 확률을 뚫고 1등에 당첨되었습니다.");}

    @Override
    public void getLottaryMoney() {System.out.println("1등 상금으로 n억을 받았습니다.");}

}
