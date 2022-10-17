package buyGroceries;

class Customer {
	private int amountOfGoods = 0;
	private double totalPrice = 0;

	void shoppingCart(double price) {
		amountOfGoods++;
		totalPrice += price;
	}
	String totalPurchases() {
		return "You purchased a total of " + amountOfGoods + " items. The total cost was " + totalPrice + " SEK";
	}
}
