package assignment1;

public class StudentAccess {

	static Student[] arr = new Student[3];
	
	
	public static void main(String[] args) {
		
	    arr[0] = new Student(1,"A",98,99,100);	
	    arr[1] = new Student(2,"B",20,30,19);	
	    arr[2] = new Student(3,"c",72,70,72);	
	    
	    for(Student a: arr){
	    	
	    	System.out.println(a.getName()+" with Regno "+a.getRegno()+" "+a.percentage(a.getCloud_score(),a.getJava_score(),a.getMl_score()));
	    	
	    }
	}

}
