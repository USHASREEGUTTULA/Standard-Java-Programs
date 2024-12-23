import java.util.Scanner;
class  PrimeNumbersFrom1to100
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

	
	 for(int n=1;n<=100;n++)
		{
		 //Count the factors of n
		 int count=0;
		for (int i=1;i<=n;i++)
		{
			if(n%i==0)
				{
					count++;
				}
		}
		//If n has two factors ,print n
				if(count==2)
					{
					System.out.println(n);






					}
		}
	}
}
