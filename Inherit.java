package div1;

class Person{
	void showRole() {
		System.out.println("Role of a Person");
		
	}
}
class Student extends Person{
	void showRole() {
		System.out.println("Role of a Student");
	}
}

public class Inherit {

	public static void main(String[] args) {
		Student obj=new Student();
			obj.showRole();

	}

}