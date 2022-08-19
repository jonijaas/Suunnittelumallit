
public class SeinaPainike{
	Command command;
	
	public SeinaPainike(Command cmd) {
		this.command = cmd;
	}
	
	public void paina() {
		command.suorita();
	}
}
