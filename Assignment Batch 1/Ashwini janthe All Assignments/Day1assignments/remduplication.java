package Day1assignments;
import java.util.Arrays;
import java.util.*;

public class remduplication {
 
		 public static int removeDuplicateElements(int arr[], int n){  
			        if (n==0 || n==1){  
			            return n;  
			        }  
			        int[] temp = new int[n];  
			        int j = 0;  
			        for (int i=0; i<n-1; i++){  
			            if (arr[i] != arr[i+1]){  
			                temp[j++] = arr[i];  
			            }  
			         }  
			        temp[j++] = arr[n-1];     
			        // Changing original array  
			        for (int i=0; i<j; i++){  
			            arr[i] = temp[i];  
			        }  
			        return j;  
			    }  
			       
			    public static void main (String[] args) {  
			    	int[] arr = new int[20];  
			        Scanner sc = new Scanner(System.in);
			        System.out.print("Enter the number of elements you want to store: ");  
			        int n =sc.nextInt();  
			        for(int i=0; i<n; i++)  
			        {  
			        //reading array elements from the user   
			        arr[i]=sc.nextInt();
			        }
			        Arrays.sort(arr);
			        int length = arr.length;  
			        length = removeDuplicateElements(arr, length);  
			        //printing array elements  
			        for (int i=0; i<length; i++)  
			           System.out.print(arr[i]+" ");  
			    }  
			  


	}


