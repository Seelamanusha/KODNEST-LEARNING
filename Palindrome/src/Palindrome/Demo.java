package Palindrome;

public class Demo {
	public static void Palindrome(int n) {
		int sum=0;
		int temp=n;
		while(n>0) {
		int	ld=n%10;
			sum=(sum*10)+ld;
			n=n/10;
			
			
			
		}
		if(sum==temp) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
	}
	

}
