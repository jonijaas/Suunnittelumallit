import java.util.Observable;

@SuppressWarnings("deprecation")
public class ClockTimer extends Observable{
	private int hours;
	private int minutes;
	private int seconds;
	
	public ClockTimer() {
		this.hours = 0;
		this.minutes = 0;
		this.seconds = 0;
	}
	
	public int getHours() {
		return this.hours;
	}
	
	public int getMinutes() {
		return this.minutes;
	}
	
	public int getSeconds() {
		return this.seconds;
	}
	
	public void tick() {
		seconds++;
		if(seconds == 60) {
			seconds = 0;
			minutes++;
			if(minutes == 60) {
				minutes = 0;
				hours++;
				if(hours == 24) {
					hours = 0;
				}
			}
		}
		
		setChanged();
		notifyObservers();
	}
}
