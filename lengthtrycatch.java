package string;
import java.util.Scanner;
public class lengthtrycatch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String S1=new String(sc.nextLine());
		int count=0;
		try
		{
			while(true)
			{
				S1.charAt(count);
				count++;
			}
		}
		catch(Exception e)
		{
			
		}
		System.out.println("Length of string= "+count);
		sc.close();
	}

}
