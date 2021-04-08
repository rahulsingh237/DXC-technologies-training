package assignment1;
import java.util.Scanner;

public class MinMax {
	
    
    
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		
	    int[] arr = new int[n];
		System.out.printf("enter %d space separated elements to fill the array",n);
		
		
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
			
		}
		
		sc.close();
		int min = arr[0];
		int max = arr[0];
		
		for(int a:arr){
			if(a < min){
				min = a;
			}
			if(a > max){
				max = a;
			}
		}
		
		System.out.println("Max: "+max+" Min: "+min);
	}

}
