package pack1;                                                                                                           
	import java.time.LocalDate;                                                                                          
	import java.time.format.DateTimeFormatter;                                                                           
	public class Lab13 {                                                                                                 
	    public static void calculateWarrantyExpiry(LocalDate purchaseDate, int warrantyMonths, int warrantyYears) {      
	        LocalDate expiryDate = purchaseDate.plusMonths(warrantyMonths).plusYears(warrantyYears);                     
	        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");                                            
	        System.out.println("Purchase Date: " + purchaseDate.format(df));                                             
	        System.out.println("Warranty Expires On: " + expiryDate.format(df));                                         
	    }                                                                                                                
	    public static void main(String[] args) {                                                                         
	        LocalDate purchase = LocalDate.of(2024, 5, 15);                                                              
	        calculateWarrantyExpiry(purchase, 6, 1);   // Example: +6 months +1 year                                     
	    }                                                                                                                
	}      