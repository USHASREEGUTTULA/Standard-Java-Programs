import java.util.Scanner;
class CoPrimeNumber2 {
   public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        int hcf = 0; // Initialize HCF

        
        for (int i = 1; i <= num1; i++)
		{
            if (num1 % i == 0 && num2 % i == 0)
			{
                hcf = i;
               
            }
        }

        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
       
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
