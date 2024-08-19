import java.util.Scanner;
class transpose
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no of rows of matrix");
int rows=sc.nextInt();
System.out.println("Enter the no of columns of matrix");
int cols=sc.nextInt();
int[][] A=new int[rows][cols];
int[][] T=new int[cols][rows];
System.out.print("Enter the matrix element");
for(int i=0;i<rows;i++)
{
for(int j=0;j<cols;j++)
{
A[i][j]=sc.nextInt();
}
}
for(int i=0;i<rows;i++)
{
for(int j=0;j<cols;j++)
{
T[j][i]=A[i][j];
}
}
System.out.print("Transpose of matrix");
for(int i=0;i<cols;i++)
{
for(int j=0;j<rows;j++)
{
System.out.print(T[i][j]+" ");
}
System.out.println();
}
sc.close();
}
} 


