import java.util.Scanner;
class  PrimeNumbers
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

	
	 for(int i=1;i<=100;i++)
		{
		 if(i%1==0 && i%i==0){

		 System.out.println("Prime numbers from 1 to 100 are :" +i);
		 }

		}
	}
}
