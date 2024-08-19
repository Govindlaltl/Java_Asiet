import java.util.*;
class prime
{
	public static void main(String args[])
	{
		int i,num;
		Scanner S1=new Scanner(System.in);
		System.out.println("Enter the number to check if it is prime or not: ");
		num=S1.nextInt();
		for(i=2;i<num;i++)
		{
			if(num%i==0)
			{
				System.out.println("The number is not prime:");
				break;
			}
			else
			{
				System.out.println("The number is prime: ");
				break;
			}
		}
	}
}
