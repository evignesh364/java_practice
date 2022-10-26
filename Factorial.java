import java.util.Scanner;
import java.math.BigInteger;

public class Factorial{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc .nextInt();
		BigInteger factorial = BigInteger.ONE;
		for(int i=1; i<=num; i++){
			//factorial =factorial*1;
			factorial = factorial.multiply(BigInteger.valueOf(i));
	}
	System.out.printf("Factorial of %d = %d", num, factorial);  
	
}
}