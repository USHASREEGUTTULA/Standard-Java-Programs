import java.util.Scanner;
class LCM_AnotherMethod
	{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        int lcm = 0;

        // Determine the larger number between num1 and num2
        int max = (num1 > num2) ? num1 : num2;

        // Use a for loop starting from max to find the LCM
        for (int i = max; i <= num1 * num2; i++)
		{
            if (i % num1 == 0 && i % num2 == 0) 
			{
                lcm = i;
                break; // Exit the loop once LCM is found
            }
        }

        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}
