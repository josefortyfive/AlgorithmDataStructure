package smallSideProj;

public class Person {

	private String firstName;
	private String lastName;
	private int age;
	
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public boolean isTeen(int age) {
		
		if(age <= 12) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public String getFullName() {
		
		if(lastName.isEmpty()) {
			return firstName;
		}
		else if(firstName.isEmpty()) {
			return lastName;
		}else {
			return "";
		}
		
	}
	
}
