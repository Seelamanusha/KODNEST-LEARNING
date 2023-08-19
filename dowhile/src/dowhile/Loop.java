package dowhile;

public class Loop {
	public static void main(String[]args) {
		int i=1;
		java:do {
			int j=1;
			loop:do {
				System.out.print("* ");
				j++;
			}while(j<=5);
			break;
			System.out.println();
			i++;
		}while(i<=5);
	}

}
