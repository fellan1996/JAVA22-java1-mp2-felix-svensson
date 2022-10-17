package buyGroceries;

class DiscountedItem extends Item{
	
	private double discount = 0.15;

	DiscountedItem(String name, double price, int inventory, int number) {
		super(name, price, inventory, number);
	}
	void applyDiscount() {
		price *=(1-discount);
		
	}
}
