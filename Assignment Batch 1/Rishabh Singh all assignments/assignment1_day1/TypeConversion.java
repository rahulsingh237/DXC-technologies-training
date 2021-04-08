package assignment1;

public class TypeConversion {

	public static void main(String[] args) {
		
		//Implicit Conversion
		
		
		int i = 100; 
        
        // automatic type conversion
        long l = i; 
          
        // automatic type conversion
        float f = l; 
        System.out.println("Int value "+i);
        System.out.println("Long value "+l);
        System.out.println("Float value "+f);
        System.out.println();
        //Explicit Conversion
        
        double d = 100.04; 
        
        //explicit type casting
        long l1 = (long)d;
          
        //explicit type casting 
        int i1 = (int)l1; 
        System.out.println("Double value "+d);
          
        //fractional part lost
        System.out.println("Long value "+l1); 
          
        //fractional part lost
        System.out.println("Int value "+i1); 
	}

}
