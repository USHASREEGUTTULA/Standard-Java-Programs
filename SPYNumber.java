import java.util.Scanner;
class SPYNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int sum=0;
		int product=1;
		while (num!=0)
		{
			int ld=num%10;
			sum=sum+ld;
			product=product*ld;
			num=num/10;
		}

		System.out.println("Product of the digits of a given number: "+product);
		System.out.println("Sum of the digits of a given number: "+sum);
		if(sum==product)
			{
				System.out.println("Given number is SPY number");
			}
			else
		{
			System.out.println("Given number is not a SPY number");
		}
	}
}