import java.util.Scanner;
public class DisplayNnaturalno{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum=0;
		for(int i=1; i<=num; i++){
			sum+= i;
			System.out.println(i);
		}
		System.out.println("Sum of Natural total :" +sum);
	}
}