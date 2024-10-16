package pizza;

public class BakedState extends State{

	public BakedState(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean bake() {
		pizza.setState(new BakedState(pizza));
		return false;
	}

	@Override
	public boolean deliver() {
		pizza.setState(new DeliveredState(pizza));
		return true;
	}

}
