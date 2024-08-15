import java.util.Scanner;
 class Frequency{
	public static void main(String[] argv){
		
		Scanner sc=new Scanner(System.in);
		int i=0,c=0;
		System.out.println("Frequency of a character in string...!");
		
		System.out.print("Enter the string:");
		String s=sc.next();
		
		System.out.print("Enter the character whose frequency to be found:");
		char ch=sc.next().charAt(0);
		
		
		for(i=0;i<s.length();i++){
			if(s.charAt(i)==ch){
				c++;
			}
			else{
				continue;
			}
		}
		
		System.out.println("Frequency of the given character is:"+c);
	}
}
