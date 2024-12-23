import java.util.Scanner;
class  StrongNumber
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter number:");
		int n=sc.nextInt();
		int x=n;
		int sum=0;
		while (x!=0)
		{
			int ld=x%10;
		
		int product=1;
		for (int i=1;i<=ld ;i++ )
				{
				product=product*i;
				}
		
		sum=sum+product;
		x=x/10;
		}
		if (sum==n)
		{
			System.out.println(+n+" is a Strong number");
		}
		else
		{
			System.out.println(+n+" is not a Strong number");
		}


		
	}
}