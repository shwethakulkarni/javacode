package string;
import java.util.Arrays;
import java.util.Scanner; 
public class Anagram {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first string: ");
	String S1=sc.nextLine();
	System.out.println("First string = "+S1);
	System.out.println("Enter second string: ");
	String S2=sc.nextLine();
	System.out.println("Second string = "+S2);
	if(S1.length()!=S2.length())
	{
		System.out.println("Not Anagram");
	}
	else
	{
		char []C1=S1.toCharArray();
		char []C2=S2.toCharArray();
		//System.out.println(Arrays.toString(C1));
		//System.out.println(Arrays.toString(C2));
		Arrays.sort(C1);
		Arrays.sort(C2);
		if(Arrays.equals(C1,C2))
		{
			System.out.println("It is Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}
	}
	sc.close();
	}

}
