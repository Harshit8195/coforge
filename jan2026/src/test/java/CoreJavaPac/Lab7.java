package CoreJavaPac;
import java.util.*;


public class Lab7 {
	public static class person{
		String firstName;
		String lastName;
		String gender;
		
		public static int getPhone() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter phone number");
			int phone = sc.nextInt();
			return phone;
		}
		person(){};
		person(String fn, String ln, String gender){
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person s = new person();
		s.setFirstName("Harshit");
		s.setLastName("Gupta");
		s.setGender("M");
		int p = s.getPhone();
		System.out.println(s.getFirstName());
		System.out.println(s.getLastName());
		System.out.println(s.getGender());
		System.out.println("Phone Number :" + p);

	}

}
