
public class CeillingFanOffCommand implements Command{

	CeillingFan ceillingFan;
	
	public CeillingFanOffCommand(CeillingFan ceillingFan) {
		this.ceillingFan = ceillingFan;
	}
	
	public void execute() {
		ceillingFan.off();
	}
}
