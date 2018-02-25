
public class Student extends Person {
	protected int grade;
	protected String schoolName;
	public Student(int age,String fullName,Address address,int grade,String school){
		super(age,fullName,address);
		this.grade=grade;
		this.schoolName=school;
	}
}
