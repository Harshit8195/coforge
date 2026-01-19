package pack1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TC_RegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String input = "12345";
//		String regex = "\\d+";
//				
//		
//		Pattern p1 = Pattern.compile(regex);
//		Matcher m1 = p1.matcher(input);
//		boolean result = m1.matches();
//		if(result) System.out.println("Valid Number");
//		else System.out.println("Invalid Number");
		
		
//		String input = "Shop, Mop, Hopping, Chopping";
//		Pattern p = Pattern.compile("hop");
//		Matcher m = p.matcher(input);
//		System.out.println(m.matches());
//		while(m.find()) {
//			System.out.println(m.group()+":"+m.start()+":"+m.end());;
//		}
		
		
//		String phonemnumer ="8612345439";
//		String regex1="\\d{10}";
// 
//		Pattern p1=Pattern.compile(regex1);
//		Matcher m1=p1.matcher(phonemnumer);
//		boolean result1=m1.matches();
//		if(result1==true){
//			System.out.println("Valid phone number");
//		}		
//		else{
//			System.out.println("Invalid phone Number");
//		}
		
//		String inp="Exo1";
//		String regex3="^[A-Z][a-z]+[0-9]$";
//		Pattern pattern3=Pattern.compile(regex3);
//		Matcher match2=pattern3.matcher(inp);
//		System.out.println(match2.matches());
		
		String email ="test.user@gmail.com";
		String emailregex2="^[A-Za-z0-9._%+-]+@[A-Za-z0-9._%+-]+\\.[A-Za-z]{2,}$";
		 
		Pattern emailp2=Pattern.compile(emailregex2);
		Matcher emailm2=emailp2.matcher(email);
		boolean emailresult2=emailm2.matches();
		if(emailresult2==true)
		{
		System.out.println("email matching");
		}
		 
		else
		{
		System.out.println("email not matching");
		}
		 
		 
		 

			
	}
	

}
