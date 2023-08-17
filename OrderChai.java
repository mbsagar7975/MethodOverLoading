import java.util.Scanner;

public class OrderChai {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the flavour of chai=");
		String flavour = scan.nextLine();
		System.out.print("Enter the quantity of chai=");
		int quantity = scan.nextInt();
		orderChai();
		orderChai(flavour, quantity);
		orderChai(flavour);
		orderChai(quantity);
	}

	public static void orderChai(int quantity) {
		System.out.println("Bill for " + quantity + " cup of chai = " + (quantity * 10.0));
	}

	public static void orderChai(String flavour) {
		System.out.println("Bill for " + flavour + " chai = 15.00 ");
	}

	public static void orderChai(String flavour, int quantity) {
		System.out.println("Bill for " + flavour + " chai for " + quantity + " cups = " + (quantity * 15.00));
	}

	public static void orderChai() {
		System.out.println("Bill for chai = 10.00 ");
	}

}
