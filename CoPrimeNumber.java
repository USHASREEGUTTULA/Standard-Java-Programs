import java.util.Scanner;
class CoPrimeNumber
{
   public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        int hcf = 1; // Initialize HCF

        // Determine the smaller of the two numbers
        int min = (num1 < num2) ? num1 : num2;

        // Iterate from min down to 1 to find the HCF
        for (int i = min; i >= 1; i--)
		{
            if (num1 % i == 0 && num2 % i == 0)
			{
                hcf = i;
                break; // Exit the loop once HCF is found
            }
        }
		if (hcf==1)
		{
			System.out.println("Coprime Numbers");
		}
		else
		{
			System.out.println(" Not Coprime Numbers");
		}

    }
}
