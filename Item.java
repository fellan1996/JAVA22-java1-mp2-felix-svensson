package buyGroceries;

class Item {
	String name;
	double price;
	int inventory;
	int number;
	Item(String name, double price, int inventory, int number) {
		this.name = name;
		this.price = price;
		this.inventory = inventory;
		this.number = number;
	}
	void inventoryReduction() {
		inventory--;
	}
	String itemDetails() {
		return number + ". Buy " + name + ", " + price + " SEK, " + inventory + " left";
	}
}
