package utils;

public class FibonacciCalculator {
	public static void fibonacci(int n) {
		boolean belongs = false;
		int num1 = 0, num2 = 1;
		while (num1 <= n) {
			if (num1 == n) {
				belongs = true;
				break;
			}
			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
		}

		if (belongs) {
			System.out.println("O número informado pertence à sequência de Fibonacci.");
		} else {
			System.out.println("O número informado não pertence à sequência de Fibonacci.");
		}
	}
}
