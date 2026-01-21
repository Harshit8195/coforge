package CoreJavaPac;
import java.util.*;

class AgeException extends Exception{
	private int age;
	AgeException(int a){
		this.age = a;
	}
	public String toString() {
		return age+"ia an invalid age";
	}
}

 class emp{
	String name;
	int age;
	void getEmpDetails() throws AgeException {
		System.out.println("Enter your detils");
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		
		System.out.println("Enter your age");
		age = sc.nextInt();
		
		if(age<16) throw new AgeException(age);
	}
}
public class userDefinedExcep {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emp obj = new emp();
		
		
		

	}

}
