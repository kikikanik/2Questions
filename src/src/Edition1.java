import java.util.Scanner;

public class Edition1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String firstQuestion = "Are you thinking of an animal, a mineral, or a vegetable? Insert Answer here: ";
		String firstAnswer = "";
		String secondQuestion = "Is it bigger or smaller than your laptop? ";
		String secondAnswer = "";
		String animalBiggerThanLaptop = "Horse";
		String animalSmallerThanLaptop = "Rabbit";
		String mineralBiggerThanLaptop = "Limestone";
		String mineralSmallerThanlaptop = "Emerald";
		String vegetableLargerThanLaptop = "Cauliflower";
		String vegetableSmallerThanLaptop = "Carrot";

		System.out.println("Welcome to the 2Question Game! I, your electronic device, will ask you two questions and will accuratly read your mind!");
		System.out.print(firstQuestion);
		firstAnswer = in.next() ;
		if (firstAnswer.equals("animal")) 
		{
			System.out.print(secondQuestion);
			secondAnswer = in.next();
			if (secondAnswer.equals("bigger")) {
				System.out.println("Is it a " + animalBiggerThanLaptop + "?");
			}
			if (secondAnswer.equals("smaller")) {
				System.out.println("Is it a " + animalSmallerThanLaptop + "?");
			}
		}
		else if (firstAnswer.equals("mineral"))
		{
			System.out.print(secondQuestion);
			secondAnswer = in.next();
			if (secondAnswer.equals("bigger")) {
				System.out.println("Is it a " + mineralBiggerThanLaptop + "?");
			}
			if (secondAnswer.equals("smaller")) {
				System.out.println("Is it an " + mineralSmallerThanlaptop + "?");
			}
		}

		else if (firstAnswer.equals("vegetable"))
		{
			System.out.print(secondQuestion);
			secondAnswer = in.next();
			if (secondAnswer.equals("bigger")) {
				System.out.println("Is it a " + vegetableLargerThanLaptop + "?");
			}
			if (secondAnswer.equals("smaller")) {
				System.out.println("Is it a " + vegetableSmallerThanLaptop + "?");
			}
		}
		System.out.println("Thank you for playing with me!");

		in.close(); //must close scanner
	}
}
