
public class Human extends EGNExtractor {
	String name;
	long EGN;
	int age;

	public Human(String name, long EGN, int age) {
		this.name = name;
		this.EGN = EGN;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getEGN() {
		return EGN;
	}

	public void setEGN(long eGN) {
		this.EGN = eGN;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void getGender(){
		System.out.println(extractEGN(this.EGN));
	}

		
	
}
