package buyGroceries;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Customer shopper = new Customer();
		Item itemOne = new Item("Dompa", 2139, 1, 1);
		Item itemTwo = new Item("Chips", 19, 22, 2);
		DiscountedItem discountItem = new DiscountedItem("Butter", 55, 6, 3);
		discountItem.applyDiscount();

		Scanner s = new Scanner(System.in);
		int choice;
		do {
			System.out.println(itemOne.itemDetails());
			System.out.println(itemTwo.itemDetails());
			System.out.println(discountItem.itemDetails());
			System.out.println("4. Quit");
			System.out.println("Choose your option: ");
			choice = s.nextInt();
			System.out.println("");

			switch (choice) {
			case 1:
				if (itemOne.inventory > 0) {
					itemOne.inventoryReduction();
					shopper.shoppingCart(itemOne.price);
				} else {
					System.out.println("item selected is sold out");
					System.out.println("");

				}
				break;
			case 2:
				if (itemTwo.inventory > 0) {
					itemTwo.inventoryReduction();
					shopper.shoppingCart(itemTwo.price);
				} else {
					System.out.println("item selected is sold out");
					System.out.println("");

				}
				break;
			case 3:
				if (discountItem.inventory > 0) {
					discountItem.inventoryReduction();
					shopper.shoppingCart(discountItem.price);
				} else {
					System.out.println("item selected is sold out");
					System.out.println("");

				}
				break;
			case 4:
				break;
			default:
				System.out.println("enter a integer between 1-4 and press 'Enter'");
				System.out.println(" ");
				break;
			}
		} while (choice != 4);

		s.close();

		System.out.println(shopper.totalPurchases());
	}

}
