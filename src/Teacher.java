
public class Teacher extends Human{
	String subject;
	boolean headTeacher;
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public boolean isHeadTeacher() {
		return headTeacher;
	}
	public void setHeadTeacher(boolean headTeacher) {
		this.headTeacher = headTeacher;
	}

	public Teacher(String name, long EGN, int age, String subject, boolean headTeacher) {
		super(name, EGN, age);
		this.subject = subject;
		this.headTeacher = headTeacher;
	}
	
	public void isHeadTeacher(boolean headTeacher){
		if(headTeacher == true){
			System.out.println(this.name + " is a headteacher.");
		}else{
			System.out.println(this.name + " is not a headteacher.");
		}
	}

}
