package pizza;

public class CookedState extends State{
	
	public CookedState(Pizza pizza) {
		super(pizza);
	}

	@Override
	public boolean bake() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deliver() {
		// TODO Auto-generated method stub
		return false;
	}

}
