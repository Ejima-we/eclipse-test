package extend.human;

public class Student extends Human {
	private int score;
	
	public Student(String name, int age, int score) {
		super(name,age);
		this.score = score;
	}
	
	public String getStudentProfile() {
		String profile = "年齢は" + super.age + "です。";
		profile += "学生でテストの点数は" + score + "です。";
		return profile;
	}
}
