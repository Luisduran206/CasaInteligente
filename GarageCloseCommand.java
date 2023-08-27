
public class GarageCloseCommand implements Command{

	Garage garage;
	
	public GarageCloseCommand(Garage garage) {
		this.garage = garage;
	}
	
	public void execute() {
		garage.close();
	}
}
