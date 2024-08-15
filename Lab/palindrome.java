import java.util.*; 
class Palindrome{ 
//main function 
      public static void main(String args[]){ 
      Scanner obj=new Scanner(System.in); 
      System.out.println("Enter the number"); 
      int num=obj.nextInt(); 
      int n=num; 
      int rev=0;
               while(num>0) 
                    { int r =num%10;
                      rev = rev*10+r;
                      num=num/10; }
                      if (n==rev) 
                       {System.out.println("palindrome"); }
                         else { System.out.println("not a palindrome");
                 } 
          } 
     }

