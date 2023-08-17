import java.util.Scanner;

public class DesiChaiWala {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the flavour=");
		String flavour=scan.nextLine();
		System.out.print("Enter number of quantity=");
		int quantity=scan.nextInt();
		double bill=orderChai(flavour,quantity);
		System.out.println("Your Bill="+bill);
		scan.close();
	}

	public static double orderChai(String flavour, int quantity) {
		return quantity*15.00;
	}

}
