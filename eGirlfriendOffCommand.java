
public class eGirlfriendOffCommand implements Command{

	eGirlfriend eGirlfriend;
	
	public eGirlfriendOffCommand(eGirlfriend eGirlfriend) {
		this.eGirlfriend = eGirlfriend;
	}
	
	public void execute() {
		eGirlfriend.off();
	}
}
