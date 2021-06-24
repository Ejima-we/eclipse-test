package practice;

public class triangle5 {
	public static void main(String[] args) {
		int max = 6;
		String star = "*";
		
		for (int i = 1; i <= max; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= max*2-(i*2)-2;k++) {
				System.out.print(star);
			}
			System.out.println();
		}
	}
}
