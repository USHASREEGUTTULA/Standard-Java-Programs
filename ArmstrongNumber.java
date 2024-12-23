import java.util.Scanner;
class  ArmstrongNumber
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter number:");
		int n=sc.nextInt();
		int count=0;
		int x=n;
		while (x!=0)
		{
			count++;
			x=x/10;
		}

		int sum=0;
		x=n;
		while (x!=0)
		{
			int ld=x%10;
			int prod=1;
			for (int i=1;i<=count ;i++ )
			{
				prod=prod*ld;	
			}
			sum=sum+prod;
			x=x/10;
		}
		if (sum==n)
		{
			System.out.println(+n+" is a Armstrong  number");
		}
		else
		{
			System.out.println(+n+" is not a Armstrong number");
		}


		
	}
}