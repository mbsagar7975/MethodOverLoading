import java.util.Scanner;

public class PuneriChai {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of chai you order=");
		int quantity=scan.nextInt();
		double bill=orderChai(quantity);
		System.out.println("Your Bill="+bill);
		
	}
	public static double orderChai(int quantity) {
		return quantity*10;
	}

}
