package pizza;

public class Pizza {

	private String name;

	State state;
	
	public Pizza() {
		state = new CookedState(this);
	}

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
