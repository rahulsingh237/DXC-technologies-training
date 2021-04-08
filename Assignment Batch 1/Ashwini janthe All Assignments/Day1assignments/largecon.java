package Day1assignments;
import java.util.*;

public class largecon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int n1=15,n2=10,n3=20;
//int sum=n1+n2+n3;
//System.out.println("sum: " +sum);
//double PI=3.145;
Scanner in = new Scanner(System.in);
System.out.println("enter 3 numbers");
int n1 = in.nextInt();
int n2 = in.nextInt();
double n3= in.nextDouble();


//System.out.println("sum: "+(n1+n2+n3));
//int lar1 =  (n1 > n2) ? n1 : n2; 
//double lar = (lar1>n3)?lar1:n3; 
double lar=(n1 > n2) ? (n1 > n3 ? n1: n3) : (n2 > n3? n2 : n3);
System.out.println("largest : "+lar);
in.close();
	}

}

