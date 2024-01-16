package interface_;

public interface RemoteController {
    // 최대 배터리의 양, 최소 배터리의 양을 상수로 지정
    int MAX_BATTERY = 100;
    int MIN_BATTERY = 0;
    
    // 리모콘의 필수 기능에 대해서만 정의
    public void turnOn();
    public void turnOff();
    public void showStatus();
}
