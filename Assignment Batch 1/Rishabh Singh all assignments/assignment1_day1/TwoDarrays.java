package assignment1;

public class TwoDarrays {

	public static void main(String[] args) {
	   
		int[][] arr = {{1,3,5,7},
			   {2,4,6,8},
			   {12,24,36,48},
			   {13,26,39,52}};
	   
	   for(int[] a1: arr){
		   for(int a: a1){
			   System.out.print(a+" ");
		   }System.out.println();
	   }

	}

}
