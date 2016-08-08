# Palindrome
import java.util.Scanner;


public class Palindromeguvi {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int b=0;
		int a;
		while(s!=0){
			a=s%10;
			b=b+a;
			s=s/10;
		}
		int mod=0;
		int sum=0;
		
			System.out.println(b);
			int temp=b;
		if(b>9){
			while(b>0){
				mod=b%10;
				sum=(sum*10)+mod;
				b=b/10;
			}
			System.out.println(sum);
		}
		if(sum==temp){
			System.out.println("the given number is palindrome");
		}
		else{
			System.out.println("the given number is not palindrome");
		}
	}
	

}
