import java.util.Scanner;
class TwistedPrimeNumber
	{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check if the original number is prime
        int count = 0;
        for (int i = 2; i < num; i++)
		{
            if (num % i == 0) 
			{
                count++;
                break;
            }
        }

        if (count == 0 ) 
			{
            // Reverse the number
            int reversed = 0, x = num;
            while (x > 0)
				{
                int digit = x % 10;
                reversed = reversed * 10 + digit;
                x /= 10;
            }

            // Check if the reversed number is prime
            int reversedCount = 0;
            for (int i = 2; i < reversed; i++) 
			{
                if (reversed % i == 0)
				{
                    reversedCount++;
                    break;
                }
            }

            // Output the result
            if (reversedCount == 0 && reversed > 1) {
                System.out.println(num + " is a twisted prime number.");
            } else {
                System.out.println(num + " is not a twisted prime number.");
            }

        } else {
            System.out.println(num + " is not a twisted prime number.");
        }
    }
}

