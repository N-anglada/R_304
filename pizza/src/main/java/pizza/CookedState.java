package pizza;

public class CookedState extends State{
	
	public CookedState(Pizza pizza) {
		super(pizza);
	}

	@Override
	public boolean bake() {
		pizza.setState(new BakedState(pizza));
		return true;
	}

	@Override
	public boolean deliver() {
		// TODO Auto-generated method stub
		return false;
	}

}
