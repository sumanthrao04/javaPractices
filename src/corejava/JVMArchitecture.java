package corejava;

public class JVMArchitecture {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Student student1 = new Student();

		Class s1 = student1.getClass();
		System.out.println(student1.getClass());
		System.out.println(s1.getName());

	}

}


class Student {

	private String name;
	private int roll_no;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

}
