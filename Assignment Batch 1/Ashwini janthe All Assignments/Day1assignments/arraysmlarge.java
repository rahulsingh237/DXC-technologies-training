package Day1assignments;
import java.util.*;
	public class arraysmlarge {
	
	public static void main(String args[])
	{
	int large,small,i;
	int a[] = new int[10];
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter array size ");  
    int n =sc.nextInt();  
    for(i=0; i<n; i++)  
    {  
      
    a[i]=sc.nextInt();
    }

	large=small=a[0];
	for(i=1;i<n;++i)
	{
	if(a[i]>large)
	large=a[i];

	if(a[i]<small)
	small=a[i];
	}

	System.out.println("small is"+small);
	System.out.println("\nThe largest element is " + large );
	}
	
		// TODO Auto-generated method stub

	}


