package Characteridentifier;
import java.util.Scanner;

public class Main {
	public static void identifyCharacter(char ch)

	{
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println("Lower-case Vowel");
		}
		else if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println("Upper-case Vowel");
		}
		else if(Character.isLetter(ch)&&Character.isLowerCase(ch))
		{
			System.out.println("Lower-case consonant");
		}
		else if(Character.isLetter(ch)&&Character.isUpperCase(ch))
		{
			System.out.println("Upper-case consonant");
		}
		else if(Character.isDigit(ch))
		{
			System.out.println("Digit");
		}
		else
		{
			System.out.println("Special character");
		}
		

}
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		char ch=scan.next().charAt(0);
		identifyCharacter(ch);
	}
		
	}
