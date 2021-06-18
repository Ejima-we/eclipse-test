package practice;

public class Chapter08_1 {
	public static void main(String[] args) {
		int i = 1;
		while (i < 5) {
			System.out.println(i * i);
			i++;
		}
		System.out.println("------------------------");
		int[] array = {2, 6, 7, 4};
		for (i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("------------------------");
		for (int val: array) {
			if (val % 2 == 0) {
				continue;
			}
			System.out.println(val);
		}
		for (i = 1; i <= 50; i++) {
			if (i % 15 == 0) {
				System.out.println();
			}
		}
	}
}
