
public class TesteIR {
	public static void main(String[] args) {

		double salary = 1900.00;

		if (salary >= 1900.00 && salary <= 2800.00) {
			System.out.println("Seu salario com a dedu��o de 7.5% do IR �: " + (salary - 142.00));
		} else if (salary >= 2800.01 && salary <= 3751.00) {
			System.out.println("Seu salario com a dedu��o de 15% do IR �: " + (salary - 350.00));
		} else if (salary >= 3751.01 && salary <= 4664.00) {
			System.out.println("Seu salario com a dedu��o de 22.5% do IR �: " + (salary - 636.00));
		}
	}
}
