package Armstrong;

public class Demo {
	int Check(int n) {
		int sum=0;
		while(n>0) {
			int ld=n%10;
			int cube=(int)Math.pow(ld,3);
		    sum=sum+cube;
			n=n/10;
			
			
			
		}
		return sum;
	}

}
