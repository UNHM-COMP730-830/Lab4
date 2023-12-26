import javax.swing.JOptionPane;

public class OrderListTab {
	
	public void showOrderDescription(Order order) {
		JOptionPane.showMessageDialog(null, String.format("Order Total $%.2f\n%s", order.getPrice(), order.getDescription()));
	}
	
	public void viewOrder1() {
		Order order = new Pizza.Builder(PizzaSize.LARGE)
				.addChicken()
				.build();
		order = new Side(order, "Nuffalo Sauce");
		order = new Side(order, "Soda");
		showOrderDescription(order);
	}
	
	public void viewOrder2() {
		Pizza pizza = new Pizza.Builder(PizzaSize.MEDIUM)
				.addPeperoni()
				.build();
		Order order = new Delivery(pizza, "88 Commercial Street, Manchester, NH");
		showOrderDescription(order);
	}
	
	public void viewOrder3() {
		Order order = new Pizza.Builder(PizzaSize.LARGE)
				.addMushrooms()
				.addTomatoes()
				.addPeppers()
				.build();
		order = new Side(order, "Ranch Sauce");
		order = new Side(order, "French Fries");
		order = new Side(order, "Soda");
		order = new Coupon(order);
		showOrderDescription(order);
	}
	
	public void viewOrder4() {
		Pizza pizza = new Pizza.Builder(PizzaSize.SMALL)
				.addBacon()
				.addPeperoni()
				.addChicken()
				.build();
		Order delivery = new Delivery(pizza, "88 Commercial Stree, Manchester, NH");
		Order order = new Coupon(delivery);
		showOrderDescription(order);
	}

}
