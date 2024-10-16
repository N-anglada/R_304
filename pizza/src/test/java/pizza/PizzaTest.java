package pizza;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PizzaTest {

	@Test
	void a_pizza_just_cooked_can_be_baked() {
		Pizza pizza = new Pizza();
		pizza.setState(new CookedState(pizza));
		
		boolean bakingDone = pizza.bake();
		assertTrue(bakingDone);
	}

	@Test
	void after_baking_it_the_pizza_is_baked() {
		Pizza pizza = new Pizza();
		pizza.setState(new CookedState(pizza));
		
		pizza.bake();
		assertTrue(pizza.getState() instanceof BakedState);
	}

	@Test
	void a_pizza_just_baked_can_not_be_baked_again() {
		Pizza pizza = new Pizza();
		pizza.setState(new BakedState(pizza));
		
		boolean bakingDone = pizza.bake();
		assertFalse(bakingDone);
		}
	
		
	@Test
	void a_pizza_just_delivered_can_not_be_baked_again() {
		Pizza pizza = new Pizza();
		pizza.setState(new DeliveredState(pizza));
		
		boolean bakingDone = pizza.bake();
		assertFalse(bakingDone);
		}
	
	@Test
	void a_pizza_just_baked_can_be_delivered() {
		Pizza pizza = new Pizza();
		pizza.setState(new BakedState(pizza));
		
		boolean deliveringDone = pizza.deliver();
		assertTrue(deliveringDone);
	}

	@Test
	void after_delivering_it_the_pizza_is_delivered() {
		Pizza pizza = new Pizza();
		pizza.setState(new BakedState(pizza));
		
		pizza.deliver();
		assertTrue(pizza.getState() instanceof DeliveredState);
	}
	
	
	@Test
	void a_pizza_just_delivered_can_not_be_delivered_again() {
		Pizza pizza = new Pizza();
		pizza.setState(new DeliveredState(pizza));
		
		boolean bakingDone = pizza.bake();
		assertFalse(bakingDone);
		}

	@Test
	void a_pizza_just_cooked_can_not_already_be_delivered() {
		Pizza pizza = new Pizza();
		pizza.setState(new CookedState(pizza));
		
		boolean bakingDone = pizza.deliver();
		assertFalse(bakingDone);
		}

		
}
