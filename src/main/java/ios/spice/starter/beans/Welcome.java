package ios.spice.starter.beans;

public class Welcome {

	public Welcome(String message) {
		super();
		this.message = message;
	}
	
	private final String message;

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
		
}
