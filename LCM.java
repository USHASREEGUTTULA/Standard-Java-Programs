import java.util.Scanner;
class LCM
{
    public static void main(String[] args)
		{
        Scanner sc = new Scanner(System.in);
        
		System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();
		System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();
	
		for (int i=1;true; i++)
		{
		
			if ((num1*i)%num2==0)
			{
				System.out.println("LCM is "+(num1*i));
				break;
			}
		}

		

		}
}
        
