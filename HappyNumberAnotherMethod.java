import java.util.Scanner;
class HappyNumberAnotherMethod
{
    public static void main(String[] args)
		{
        Scanner sc = new Scanner(System.in);
        
		System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        
        while (num>1) 
		{ 
            int sum = 0;
			while (num!=0)
			{
                int ld = num % 10;   
                sum =sum+ ld * ld;   
                num /= 10;             
            }
            num = sum; 
			if (num==4)
			{
				break;
			}
        }

        if (num == 1) 
		{
            System.out.println("Happy Number.");
        }
		else
		{
            System.out.println("not a Happy Number.");
        }
    }
}
