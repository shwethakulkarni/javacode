package string;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String a=sc.nextLine();
		System.out.println(a);	
		String output="";
		for(int i=a.length()-1;i>=0;i--)
		{
			//char b=a.charAt(i);
			//output=output+b;
			output += a.charAt(i);
		}
		System.out.println(output);
		if(a.equalsIgnoreCase(output))
			System.out.println("Palindrome");
		else
			System.out.println("Non palindrome");
		sc.close();
	}
	}
	


