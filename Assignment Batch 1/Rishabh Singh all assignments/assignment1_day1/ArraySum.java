package assignment1;
import java.util.Scanner;

public class ArraySum {
	
	
	
	static int[] arr = new int[7];
	
	public static void main(String args[]){
		System.out.println("enter 7 space separated elements to fill the array");
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<7; i++){
			arr[i] = sc.nextInt();
			
		}
		
		sc.close();
		int sum =0;
		
		for(int a:arr){
			sum += a;
		}
		
		System.out.println(sum);
	}

}
