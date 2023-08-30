package Armstrong;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		Demo d=new Demo();
		int res=d.Check(n);
		if(res==n) {
			System.out.println(n+" is a armstrong number");
		}
		else {
			System.out.println(n+" is not armstrong number");
		}
		
	}

}
