import java.util.Scanner;

public class AtmApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Atm myAtm = new Atm(100);

		System.out.println("Enter Your PIN:");
		
		String enteredPin = input.nextLine();

		while (!enteredPin.equals(myAtm.getRequiredPin())) {
			System.out.println("Pins do not match, try again.");
			enteredPin = input.nextLine();
		}

		String choice;

		do {
			System.out.println("Welcome to the Bank of We Can Code It!");
			System.out.println("Choose and option:");
			System.out.println("Press 1 for deposit.");
			System.out.println("Press 2 for withdraw.");
			System.out.println("Press 3 for check balance.");
			System.out.println("Press 4 to exit.");
			choice = input.nextLine();

			if (choice.equals("1")) {
				System.out.println("How much are you planning to deposit?");
				int amount = input.nextInt();
				myAtm.deposit(amount);
				input.nextLine();
			} else if (choice.equals("2")) {
				System.out.println("Please withdraw in multiples of 10.");
				int amount = input.nextInt();
				myAtm.withdraw(amount);
				input.nextLine();

			} else if (choice.equals("3")) {
				System.out.println("Your current balance is " + myAtm.getBalance());

			} else if(choice.equals("4")) {
				System.out.println("Thank you for banking with us today!");
				System.exit(0);
				
			}else {
				System.out.println("I don't understand your selection. Try again.");
			}

		} while (!choice.equals("4"));

		input.close();
	}
}
