import java.util.Scanner;
class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int x=num;
		int rev=0;
		while (x!=0)
		{
			int ld=x%10;
			rev=rev *10+ld;
			x=x/10;
		}

		System.out.println("Reverse of the given number: "+rev);

		if(rev==num)
		{
			System.out.println(num+"is a palindrome number ");
		}
		else
			{
			System.out.println(num+"is not a palindrome number ");
		}

	}
}