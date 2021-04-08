package assignment3;

public class Utility {
	
	protected String formatNumber(float num){
		String aa = String.format("%.2f",num);
		return aa;
	}
	
	protected String formatNumber(double num){
		String aa = String.format("%.3f",num);
		return aa;
	}
	
	protected String formatNumber(String num){
		double a = Double.parseDouble(num);
		
		String aa = String.format("%.3f",a);
		return aa;
	}

}
