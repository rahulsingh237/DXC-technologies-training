package assignment3;

public class FormatAccess {

	public static void main(String[] args) {
		  Utility hs = new Utility();
		  
	        System.out.println(hs.formatNumber(500.9989F)); //printed with 2 decimal places
	        System.out.println(hs.formatNumber(89.9934)); // printed with 3 decimal places
	        System.out.println(hs.formatNumber("550"));  // converted to double & printed with 3 places

	}

}
