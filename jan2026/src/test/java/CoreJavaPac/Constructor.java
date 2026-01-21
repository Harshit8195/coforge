package CoreJavaPac;

public class Constructor {
	public static class student{
		String firstName;
		String lastName;
		String gender;
		student(){};
		student(String fn, String ln, String gender){
			this.firstName = fn;
			this.lastName = ln;
			this.gender = gender;
		}
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
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
	}
	
	public static void main(String args[]) {
		student s = new student();
		s.setFirstName("Harshit");
		s.setLastName("Gupta");
		s.setGender("M");
		System.out.println(s.getFirstName());
		System.out.println(s.getLastName());
		System.out.println(s.getGender());

	}
}
