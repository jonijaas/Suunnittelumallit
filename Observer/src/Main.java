
/*
 * @author Joni Jääskeläinen
 */
public class Main {
	public static void main(String[] args) {
		ClockTimer timer = new ClockTimer();
		DigitalClock digitalclock = new DigitalClock(timer);
		
		while(timer.getHours() < 1) {
			timer.tick();
		}
	}
}
