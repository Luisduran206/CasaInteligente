
public class eGirlfriendOnCommand implements Command{

	eGirlfriend eGirlfriend;
	
	public eGirlfriendOnCommand(eGirlfriend eGirlFriend) {
		this.eGirlfriend = eGirlFriend;
	}
	
	public void execute() {
		eGirlfriend.on();
	}
}
