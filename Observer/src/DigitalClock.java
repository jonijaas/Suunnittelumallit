import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class DigitalClock implements Observer {
	private ClockTimer timer;
	
	public DigitalClock(ClockTimer ct) {
		this.timer = ct;
		timer.addObserver(this);
	}
	
	@Override
	public void update(Observable observable, Object o) {
		if (observable == timer) {
			draw();
		}
	}
	
	private void draw() {
		int hour = timer.getHours();
		int minute = timer.getMinutes();
		int second = timer.getSeconds();
		System.out.println("Kello on " + String.format("%02d:%02d:%02d", hour, minute, second));
	}

}
