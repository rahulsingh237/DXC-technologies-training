package assignment1;

public class Student {
	
	Student(int regno, String name, int java_score, int cloud_score, int ml_score) {
		super();
		this.regno = regno;
		this.name = name;
		this.java_score = java_score;
		this.cloud_score = cloud_score;
		this.ml_score = ml_score;
	}

	private int regno;
	private String name;
	
	private int java_score;
	private int cloud_score;
	private int ml_score;
	
	public String percentage(int s1, int s2, int s3){
		
		int percentage = (s1 + s2 + s3)/3;
		
		if(percentage >= 95){
			return "Distinction";
		}else if(percentage >33 && percentage < 95){
			return "Passed the class";
			
		}else{
			return "Fail in this class";
		}
	}

	public int getRegno() {
		return regno;
	}

	public String getName() {
		return name;
	}

	public int getJava_score() {
		return java_score;
	}

	public int getCloud_score() {
		return cloud_score;
	}

	public int getMl_score() {
		return ml_score;
	}
	
	}
