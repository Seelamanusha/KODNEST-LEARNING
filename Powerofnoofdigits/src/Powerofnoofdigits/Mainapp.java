package Powerofnoofdigits;

public class Mainapp {
	int countdigits(int num)



	{



	int count=0;



	while(num!=0)



	{



	num=num/10;



	count++;



	}



	return count;



	}

	int raiseToTwo(int n, int count)



	{int finalresult=1;



		for(int i=1;i<=count;i++)



		{



		finalresult=finalresult*n;



		}



		return finalresult;



		}





}


