package ClassMethod.human;

public class ClassMethod02 {
	public static void main(String[] args) {
		Human02 yamada = new Human02();
		System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。");
		
		Human02 human = new Human02("佐藤", 25);
		System.out.println("名前は" + human.name + "で、年齢は" + human.age + "です。");
	}
}
