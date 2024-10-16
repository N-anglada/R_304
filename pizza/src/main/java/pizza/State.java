package pizza;

public abstract class State {
	protected Pizza pizza;
	
	public State(Pizza pizza) {
		this.pizza=pizza;
	}
	
	public abstract boolean bake();
	public abstract boolean deliver();
}
