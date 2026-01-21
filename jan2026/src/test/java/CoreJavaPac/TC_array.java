package CoreJavaPac;
import java.util.*;
public class TC_array {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[10];
		int a[] = {1,2,3,4};
		int TwoD[][] = new int[3][4];
		
		int numbers[] = {1,2,3,4,5,6,7,8};
		System.out.println(numbers);
		System.out.println(numbers.length);
		for(int value : numbers) {
			System.out.println(value);
		}
		int[] numbers2=new int[5];
		numbers2[0]=100;
		
		
		int[][] matrix= {{1,2,3},{4,5,6}};
		
		System.out.println(matrix[1][2]);
		System.out.println("length:"+matrix.length);

	}

}
