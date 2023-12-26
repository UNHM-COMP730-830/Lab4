
public class Pizza implements Order {
	
	private PizzaSize size;
	private Boolean cheese;
	private Boolean tomatoes;
	private Boolean peperoni;
	private Boolean bacon;
	private Boolean mushrooms;
	private Boolean chicken;
	private Boolean pineapples;
	private Boolean peppers;
	
	public Pizza (Builder builder) {
		this.size = builder.size;
		this.cheese = builder.cheese;
		this.tomatoes = builder.tomatoes;
		this.peperoni = builder.peperoni;
		this.bacon = builder.bacon;
		this.mushrooms = builder.mushrooms;
		this.chicken = builder.chicken;
		this.pineapples = builder.pineapples;
		this.peppers = builder.peppers;
	}
	
	@Override
	public String getDescription() {
		String description = size.getDescription();
		if (cheese) description += ", cheeze";
		if (bacon) description += ", bacon";
		if (tomatoes) description += ", tomatoes";
		if (peperoni) description += ", peperoni";
		if (mushrooms) description += ", mushrooms";
		if (chicken) description += ", chicken";
		if (pineapples) description += ", pineapples";
		if (peppers) description += ", peppers";
		return description;
	}
	
	@Override
	public double getPrice() {
		return size.getPrice();
	}

	public static class Builder {
		private PizzaSize size;
        private Boolean cheese = false;
        // Define the other Bookeab values

        public Builder(PizzaSize size) {
        	// ...
        }

        public Builder addExtraCheese() {
        	// ...
        }

        public Builder addTomatoes() {
        	// ...
        }

        public Builder addPeperoni() {
        	// ...
        }

        public Builder addBacon() {
        	// ...
        }

        public Builder addChicken() {
        	// ...
        }

        public Builder addMushrooms() {
        	// ...
        }

        public Builder addPineapples() {
        	// ...
        }

        public Builder addPeppers() {
        	// ...
        }

        public Pizza build() {
        	// ...
        }
		
	}

}
