package pack1;
import java.util.*;
public class lab9 {
	
	public static String operation(String input, int choice) {
		switch(choice) {
		case 1: 
			return input + input;
		case 2:
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<input.length(); i++) {
				if(i%2 != 0) sb.append('#');
				else sb.append(input.charAt(i));
			}
			return sb.toString();	
		case 3 :
			Set<Character> set = new LinkedHashSet<>();
			for(int i=0 ; i<input.length(); i++) {
				set.add(input.charAt(i));
			}
			StringBuilder sb2 = new StringBuilder();

			for (char c : set) {
				sb2.append(c);
			}

			return sb2.toString();
		case 4 :
			StringBuilder sb3 = new StringBuilder();
			for(int i=0;i<input.length();i++) {
				char c = input.charAt(i);
				if(i%2!=0) sb3.append(Character.toUpperCase(c));
				else sb3.append(c);
			}
			return sb3.toString();
		default :
			return "Invalid";
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String input = sc.nextLine();
		System.out.println("Enter Choice fron 1 to 4");
		int choice = sc.nextInt();
		String result = operation(input, choice);
		System.out.println(result);
	}

}
