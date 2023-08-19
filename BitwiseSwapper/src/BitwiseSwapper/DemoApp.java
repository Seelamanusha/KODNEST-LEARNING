package BitwiseSwapper;
import java.util.Scanner;

public class DemoApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first integer:");
		int first =scan.nextInt();
		System.out.println("Enter the second integer:");
		int second=scan.nextInt();
		swapUsingBitwise( first, second);
		}
		public static void swapUsingBitwise( int a, int b) {

		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("After swapping");
		System.out.println("first= " + a + ", second= " + b);
		}

		}


