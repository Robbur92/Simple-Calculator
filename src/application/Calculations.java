package application;

public class Calculations {
	public float Calculate(long numberOne, long numberTwo, String operator) {
		switch (operator) {
		case "+":
			return numberOne + numberTwo;
		case "-":
			return numberOne - numberTwo;
		case "*":
			return numberOne * numberTwo;
		case "/":
			if(numberTwo == 0)
				return 0;
			return numberOne / numberTwo;
		case "C":
			return 0;
		default:
			return 0;
		}
	}
}
