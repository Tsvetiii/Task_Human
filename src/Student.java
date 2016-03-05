
public class Student extends Human {
	int numberInClass;
	double averageSuccess;	
	
	public int getNumberInClass() {
		return numberInClass;
	}
	public void setNumberInClass(int numberInClass) {
		this.numberInClass = numberInClass;
	}

	public double getAverageSuccess() {
		return averageSuccess;
	}
	public void setAverageSuccess(double averageSuccess) {
		this.averageSuccess = averageSuccess;
	}

	public Student(String name, long EGN, int age,int numberInClass,double averageSuccess) {
		super(name, EGN, age);
		this.numberInClass = numberInClass;
		this.averageSuccess = averageSuccess;
	}
	
	public void excellentStudent(double averageSuccess){
		if(this.averageSuccess >= 5.5){
			System.out.println(this.name + " is an excellent student.");
		}else{
			System.out.println(this.name + " is not an excellent student.");
		}
	}
}