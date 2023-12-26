import javax.swing.JOptionPane;

public class PizzaMenuTab {
	
	public void showPizzaDescription(Pizza pizza) {
		JOptionPane.showMessageDialog(null, String.format("Here is Your Pizza:\n%s", pizza.getDescription()));
	}
	
	public void makeBigCheesePizza() {
		Pizza pizza = new Pizza.Builder(PizzaSize.LARGE)
				.addExtraCheese()
				.build();
		showPizzaDescription(pizza);
	}
	
	public void makeClassicPeperoniPizza() {
		Pizza pizza = new Pizza.Builder(PizzaSize.SMALL)
				.addPeperoni()
				.build();
		showPizzaDescription(pizza);
	}
	
	public void makeMeatLoversPizza() {
		Pizza pizza = new Pizza.Builder(PizzaSize.SMALL)
				.addPeperoni()
				.addBacon()
				.build();
		showPizzaDescription(pizza);
	}
	
	public void makeBuffaloChickenPizza() {
		Pizza pizza = new Pizza.Builder(PizzaSize.MEDIUM)
				.addChicken()
				.build();
		showPizzaDescription(pizza);
	}

	public void makeVeggiePizza() {
		Pizza pizza = new Pizza.Builder(PizzaSize.LARGE)
				.addPeppers()
				.addTomatoes()
				.addMushrooms()
				.build();
		showPizzaDescription(pizza);
	}
	
	public void makeHawaiianPizza() {
		Pizza pizza = new Pizza.Builder(PizzaSize.MEDIUM)
				.addPineapples()
				.addChicken()
				.addPeppers()
				.build();
		showPizzaDescription(pizza);
	}
}
