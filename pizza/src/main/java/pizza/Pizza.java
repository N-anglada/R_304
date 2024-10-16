package pizza;

public class Pizza {

	public static final int COOKED = 0;
	public static final int BAKED = 1;
	public static final int DELIVERED = 2;

	private String name;

	State state;

	public boolean bake() {
		return state.bake();
	}

	public boolean deliver() {
		return state.deliver();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

}
