import java.util.Scanner;
class fibonacci
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of terms:");
int n=sc.nextInt();
int firstterm=0,secondterm=1;
System.out.println("Fibonacci Series:"+firstterm+","+secondterm);
for(int i=3;i<=n;i++)
{
int nextterm=firstterm+secondterm;
System.out.print(","+nextterm);
firstterm=secondterm;
secondterm=nextterm;
}
sc.close();
}
}

