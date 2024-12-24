import java.util.Scanner;
class MagicNumberAnotherMethod
	{
    public static void main(String[] args)
		{
        Scanner scanner = new Scanner(System.in);
        
		System.out.print("Enter a number: ");
        int num = scanner.nextInt();

      while (num> 9) 
		{
            
            int sum = 0;

           
            while (num != 0)
			{
				int ld=num%10;
                sum =sum+ld;
                num = num/10;
            }
			num=sum;
        }

        // Check if the single digit is 1
        if (num == 1) {
            System.out.println( "is a magic number.");
        } else {
            System.out.println( "is not a magic number.");
        }
    }
}