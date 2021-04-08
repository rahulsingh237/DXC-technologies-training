package assignment1;
import java.util.Scanner;

public class SearchArray {

	public static void main(String[] args) {
		
		int[] arr = new int[7];
		
		System.out.println("enter 7 space separated elements to fill the array");
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<7; i++){
			arr[i] = sc.nextInt();
			
		}
		
		
        System.out.println("enter integer to be searched");
        int n = sc.nextInt();
        sc.close();
        
        for(int i=0; i<7; i++){
        	if(arr[i] == n){
        		System.out.printf("%d is present at %d position",n,i+1);
        	}
        }
        
	}

}
