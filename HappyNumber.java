import java.util.Scanner;
class HappyNumber
{
    public static void main(String[] args)
		{
        Scanner sc = new Scanner(System.in);
        
		System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int x = num;

        while (x!= 1 ) 
		{ 
            int sum = 0;
			while (x!=0)
			{
                int ld = x % 10;   
                sum =sum+ ld * ld;   
                x /= 10;             
            }
            x = sum; 
        }

        if (x == 1) 
		{
            System.out.println(num + " is a Happy Number.");
        }
		else
		{
            System.out.println(num + " is not a Happy Number.");
        }
    }
}
