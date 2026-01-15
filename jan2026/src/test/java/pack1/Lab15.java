package pack1;
 
	import java.time.LocalDate;
	import java.time.Period;
	
	class Person11 {
	
	    private String firstName;
	    private String lastName;
	    private LocalDate dateOfBirth;
	
	    public Person11(String firstName, String lastName, LocalDate dateOfBirth) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.dateOfBirth = dateOfBirth;
	    }
	
	    // (a) Method to calculate age
	    public int calculateAge() {
	        return Period.between(dateOfBirth, LocalDate.now()).getYears();
	    }
	
	    // (b) Method to return full name
	    public String getFullName() {
	        return firstName + " " + lastName;
	    }
	
	    public void displayDetails() {
	        System.out.println("Full Name: " + getFullName());
	        System.out.println("Age: " + calculateAge());
	    }
	}
	
	public class Lab15{
	
	    public static void main(String[] args) {
	        Person11 p = new Person11("	Tanisha", "Agarwal", LocalDate.of(2004, 8, 23));
	        p.displayDetails();
	    }
	}
	