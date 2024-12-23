import java.util.Scanner;
class DuckNumberAnotherMethod
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int x=n;
		boolean isZeroPresent=false;
		while (x!=0)
	
		{
			int ld=x%10;
			if (ld==0)
			{
				isZeroPresent=true;
				break;
			}
			x=x/10;
		}
		
		if (isZeroPresent)
		{
			System.out.println(n+" is a duck number");
		}
		else
			{
			System.out.println(n+" is not a duck number");
		}

	}
}