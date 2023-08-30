package Powerofnoofdigits;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan =new Scanner(System.in);

		int num=scan.nextInt();

		Mainapp theCounting=new Mainapp();



		int count = theCounting.countdigits(num);
		Mainapp p1=new Mainapp();



		int res=p1.raiseToTwo(num,count);



		System.out.println(res);

		



		

	}



}


