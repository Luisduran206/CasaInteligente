
public class CeillingFanOnCommand implements Command{

	CeillingFan ceillingFan;
	
	public CeillingFanOnCommand(CeillingFan ceillingFan) {
		this.ceillingFan = ceillingFan;
	}
	
	public void execute() {
		ceillingFan.on();
	}
	
}
