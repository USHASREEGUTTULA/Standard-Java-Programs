import java.util.Scanner;
class TwistedPrimeNumber2
	{
    public static void main(String[] args)
		{
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check if the original number is prime
        int count = 0;
				for (int i = 1; i <= num; i++)
				{
					if (num % i == 0) 
					{
						count++;
						
					}
				}

        if (count !=2) 
		
		{
            System.out.println(num + " is not a twisted prime number.");
        }
		else
		{
					// Reverse the number
							int reversed = 0;
								int x = num;
							while (x != 0)
								{
								int ld = x % 10;
								reversed = reversed * 10 + ld;
								x /= 10;
							}

					// Check if the reversed number is prime
							int Count = 0;
							for (int i = 1; i <= reversed; i++) 
							{
								if (reversed % i == 0)
								{
									Count++;
									
								}
							}

					// Output the result
					if (Count == 2) 
					{
						System.out.println(num + " is a twisted prime number.");
					}
					else 
					{
						System.out.println(num + " is not a twisted prime number.");
					}
		}



        
	}
}


