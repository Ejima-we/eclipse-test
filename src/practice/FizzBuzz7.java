package practice;

public class FizzBuzz7 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 42 == 0) {
				System.out.println(i + " = FizzBuzz");
			} else if (i % 7 == 0) { 
				System.out.println(i + " = Buzz");
			} else if (i % 6 == 0) {
				System.out.println(i + " = Fizz");
			}
		}
	}

}
