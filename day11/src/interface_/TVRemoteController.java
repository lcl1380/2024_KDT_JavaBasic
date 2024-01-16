package interface_;

public class TVRemoteController implements RemoteController {
    private final int inch;
    private int channel;
    
    public TVRemoteController(int inch) {
	this.inch = inch;
	this.channel = 1;
    }

    @Override
    public void turnOn() {
	System.out.println("TV를 켭니다.");
	
    }

    @Override
    public void turnOff() {
	System.out.println("TV를 끕니다.");
	
    }

    @Override
    public void showStatus() {
	System.out.println("화면 크기 : " + this.inch);
	System.out.println("현재 채널 : " + this.channel);
    }
    
    public void setChannelDown() {
	// 1번까지만 채널이 있음
	if(this.channel - 1<1) { this.channel = 1;}
	else {this.channel--;}}
	
	    public void setChannelUp() {
		// 1번까지만 채널이 있음
		if(this.channel - 1>1) {this.channel++;;}
		else {this.channel = 1;}
    }

}
