package pizza;

public class DeliveredState extends State{

	public DeliveredState(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
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
