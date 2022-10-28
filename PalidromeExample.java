import java.util.Scanner;
public class PalidromeExample{
public static void main(String args[]){
int r, sum=0, temp;

Scanner sc=new Scanner(System.in);
System.out.print("Enter the number: ");
int n=sc.nextInt();

temp=n;
while(n>0){
r=n%10;
sum=(sum*10)+r;
n=n/10;
}
if(temp==sum){
System.out.println("Is a palidrome");
}
else{
	System.out.println("Is not a palidrome");
}
}
}