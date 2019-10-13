
public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("Testando condicionais");
		int age = 21;
		int quantity = 3;
		
		if (age >= 18) {
			System.out.println("You've more than 18 years old!");
			System.out.println("Wellcome");
		}else if (quantity >= 2) {
			
			System.out.println("You don't have more than 18, but you are a companion....you can enter");
		}else {
			System.out.println("Sorry, but you can't enter here");
			
		}
	}

}
