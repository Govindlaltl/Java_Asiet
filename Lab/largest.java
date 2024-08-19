import java.util.*;
class largest
{
public static void main(String[] args)
{
double a,b,c;
System.out.println("Enter a,b,c");
Scanner sc=new Scanner(System.in);
a=sc.nextDouble();
b=sc.nextDouble();
c=sc.nextDouble();
double Large;
if (a>=b&&a>=c)
{
Large=a;
}
else if(b>=a&&b>=c)
{
Large=b;
}
else{
Large=c;
}
System.out.println("The largest of the three number is"+Large);
sc.close();
}
}
