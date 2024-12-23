import java.util.Scanner;
class  DuckNumber
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter number:");
		int n=sc.nextInt();
		int x=n;
		int product=1;
		while (x!=0)
		{
			int ld=x%10;
			product=product*ld;	
			x=x/10;
		}
		if (product==0)
		{
			System.out.println(+n+" is a Duck number");
		}
		else
		{
			System.out.println(+n+" is not a Duck number");
		}


		
	}
}